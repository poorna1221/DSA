package amazon;

import java.util.HashSet;
import java.util.Set;

public class SumOfIntegersMakesTarget {

    static void sumOfIntegers_on2() {
        int target = 5;
        int arr[] = {5, 7, 1, 2, 8, 4, 3};

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("i is" + i + " j is" + j + "arr[i] is " + arr[i] + " arr[j] is " + arr[j]);
                if (arr[i] + arr[j] == target) {
                    // System.out.println("sumr of " + arr[i] + "and " + arr[j] + "equals to target");

                }
            }


        }


    }

    static boolean sumOfIntegerson(int[] arr, int target) {


        Set<Integer> sI = new HashSet<Integer>();
        for (int b : arr) {
            if (sI.contains(target - b)) {
                return true;

            } else {
                sI.add(b);
            }


        }

        return false;
    }

    public static void main(String[] args) {
        int target = 13;

        int arr[] = {5, 7, 1, 2, 8, 4, 3};
        // System.out.println(sumOfIntegerson(arr, target));
        sumOfIntegers_on2();
    }
}
