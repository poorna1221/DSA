package amazon;

import java.util.*;
import java.util.stream.Collectors;

public class MostFrequentKElements {
    static int[] frequentElement(int[] arr, int k) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        ArrayList<Integer> aList = new ArrayList<Integer>();

        Arrays.stream(arr).forEach(element -> {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        });

        frequencyMap.forEach((e, f) -> {
            // System.out.println("key is" + e + " value is" + f);
        });
        // System.out.println("------------");
        Map<Integer, Integer> answerMap = frequencyMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(k)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));


        answerMap.forEach((e, f) -> {
                    aList.add(e);
                }
        );
        int answerArr[] = new int[k];
        for (int i = 0; i < aList.size(); i++) {
            answerArr[i] = aList.get(i);
        }

        return answerArr;
    }

    static int[] frequentElement2(int[] arr, int k) {
        Map<Integer, Integer> fMap = new HashMap<>();
        Arrays.stream(arr).forEach(e ->
                fMap.put(e, fMap.getOrDefault(e, 0) + 1)

        );

        fMap.forEach((i, j) -> {
            System.out.println("Kye is" + i + " value is" + j);
        });


        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 1, 2, 2, 4, 4, 4, 4, 3, 3, 3, 3, 3};
        int k = 2;
        int[] arrAns = frequentElement(arr, k);

        for (int i : arrAns) {
            System.out.println(i);
        }

    }
}
