package amazon;

import java.util.HashMap;
import java.util.Map;

public class FinaAPair {
    static void findPair() {

        int arr[] = {1, 9, 4, 6, 3, 2};
        int target = 15;

        Map<Integer, Integer> mp = new HashMap<>();
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (mp.containsKey(target - arr[i])) {
                k++;
                System.out.println("Pair is found " + arr[i] + " and " + (target - arr[i]));
                System.out.println("indexes are" + i + " and" + mp.get(target - arr[i]));

            } else {
                mp.put(arr[i], i);
            }
        }
        if (k == 0) {
            System.out.println("Pair not found");
        }

    }

    public static void main(String[] args) {
        findPair();

    }
}
