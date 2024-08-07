package DeleteMePractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSumWithTarget {
    static void tF() {

        int arr[] = {11, 1, 7, 15, 2, 8};
        int target = 9;
        List<Integer> list = new ArrayList<>();
        boolean pairFound = false;
        for (int i = 0; i < arr.length; i++) {

            if (list.contains(target - arr[i])) {
                System.out.println("pairs are " + arr[i] + " and " + (target - arr[i]));
                System.out.println("indexes are " + i + " and " + list.indexOf(target - arr[i]));
            } else {
                list.add(arr[i]);
            }
        }

    }

    public static void main(String[] args) {
        tF();
    }
}
