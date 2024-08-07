package DeleteMePractice;

import java.util.*;

public class RemoveDuplicatesFromString {
    static void removeDuplicatesFromString() {

        String str = "POORNA";
        Set<Character> st = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            st.add(c);
        }

        st.stream().forEach(System.out::println);
    }

    static void findDuplicatesFromString() {
        String str = "POORNARP";
        Set<Character> st = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            if (!st.add(c)) {
                System.out.println("" + c);
            }
        }
    }

    static void removeElementFromArray() {
        int arr[] = {2, 3, 1, 1, 4, 2};
        int target = 2;
        List<Integer> ls = new ArrayList<>();
        for (int i : arr) {
            if (i != target)
                ls.add(i);
        }

        // ls.stream().forEach(System.out::println);
        int ansarr[] = ls.stream().mapToInt(a -> a).toArray();
        for (int x : ansarr)
            System.out.println(x);

    }

    static void removeElementFromArray_2() {
        int arr[] = {2, 3, 1, 1, 4, 2};
        int ansArray[] = new int[arr.length];
        int target = 2;
        int j = 0;
        int zeroCount = 0;

        for (int i : arr) {
            if (i != target) {
                ansArray[j++] = i;
            } else {
                zeroCount++;
            }
        }
        //System.out.println("" + Arrays.toString(ansArray));
        int a[] = Arrays.copyOfRange(ansArray, 0, (arr.length - zeroCount));
        System.out.println("" + Arrays.toString(a));
    }

    public static void main(String[] args) {
        removeElementFromArray_2();

    }
}
