package amazon;

import java.util.Arrays;

public class MaxSumOfKConsecutiveElements {

    static void maxSumOfKConsecutiveElements() {
        int arr[] = {1, 2, 3, 4, 35, 6, 7, 8, 9, 10};

        int k = 5;
        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
            if (windowSum > maxSum) {
                maxSum = windowSum;

            }
        }

        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum + arr[i] - arr[i - k];
            if (windowSum > maxSum)
                maxSum = windowSum;


        }

        System.out.println(maxSum);

    }

    static void minSumOfKConsecutiveElements_2() {
        int arr[] = {6, 7, 3, 4, 35, 2, 3, 10, 1, 2, 1};
        int k = 2;

        int currentSum = 0, minSum = Integer.MAX_VALUE;
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
            if (currentSum < minSum) {
                minSum = currentSum;

            }
        }

        for (int i = k; i < arr.length; i++) {
            currentSum = currentSum + arr[i] - arr[i - k];
            if (currentSum < minSum) {
                minSum = currentSum;
                System.out.println(Arrays.toString(Arrays.copyOfRange(arr, i - (k - 1), i + 1)));
            }

        }
        System.out.println("Max sub array sum is" + minSum);
    }


    static void findSubArrayToGetSum() {
        int arr[] = {1, 7, 4, 3, 1, 2, 1, 5, 1};
        int sum = 0;
        int targetSum = 7;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum == targetSum) {
                    //System.out.println("i is" + i + " j is" + j);
                    System.out.println(Arrays.toString(Arrays.copyOfRange(arr, i, j + 1)));
                }
            }
            sum = 0;
        }
    }//Brute force

    static void findSubArrayToGetSum_2() { //sliding window for - only positive numbers

        int arr[] = {1, 1, 7, 4, 3, 1, 2, 1, 5, 1};
        int sum = 0;
        int targetSum = 7;
        int startPos = 0;
        boolean arrayFound = false;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum == targetSum) {
                arrayFound = true;
                System.out.println(Arrays.toString(Arrays.copyOfRange(arr, startPos, i + 1)));

            }


            while (sum > targetSum) {
                sum = sum - arr[startPos];
                startPos++;
            }


        }
        if (arrayFound) {
            System.out.println("target array found");
        } else {
            System.out.println("target array not found");
        }

    }


    public static void main(String[] args) {
        minSumOfKConsecutiveElements_2();

    }
}
