package DeleteMePractice;

import java.util.Arrays;
import java.util.Stack;

public class AddDigits_2 {
    public void addOneToLast() {

    }

    public static void missingNo() {


    }

    public static void maxSumArray() {


    }

    public static void maxSum() {
        int nums[] = {3, -4, 2, 4};
        int sp = 0, ep = 0;
        int currentSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > currentSum + nums[i]) {
                sp = i;
            }
            currentSum = Math.max(currentSum + nums[i], nums[i]);


            if (currentSum > maxSum) {
                maxSum = currentSum;
                ep = i;
            }
        }
        System.out.println("Array is" + Arrays.toString(Arrays.copyOfRange(nums, sp, ep + 1)));
    }

    static void findSubArrayToGetSum_2() { //sliding window for - only positive numbers

        int arr[] = {1, 1, 7, 4, 3, 1, 2, 1, 5, 1};

        int sp = 0, ep = 0, sum = 0, targetSum = 7;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum == targetSum) {
                System.out.println(Arrays.toString(Arrays.copyOfRange(arr, sp, i + 1)));

            }
            while (sum > targetSum) {
                sum = sum - arr[sp];
                sp++;
            }

        }

    }

    public static void main(String[] args) {

        int number = 999;
        int sum = 0;
        int newSum = Integer.MAX_VALUE;

        while (newSum > 10) {

            while (number > 0) {

                sum = sum + (number % 10);
                number = number / 10;

            }
            newSum = sum;
            number = sum;
            sum = 0;
        }
        System.out.println(newSum);
    }

    public static void replace() {
        String str = "POORNA";
       /* String newString = str.replace('O', 'W');
        System.out.println(newString);*/

       /* StringBuilder sb = new StringBuilder(str);
        sb.replace(0, 4, "CHAN");
        System.out.println(sb.toString());*/

        float a = 3;
        float b = 4;
        float c = (a + b) / 2;
        System.out.println(c);

    }

    public static void maxSum2() {

        int arr[] = {-2, 3, 2, 4};
        int sp = 0, ep = 0;
        int currentMax = arr[0], maxSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > currentMax + arr[i]) {
                sp = i;
            }
            currentMax = Math.max(arr[i], currentMax + arr[i]);

            if (currentMax > maxSum) {
                maxSum = currentMax;
                ep = i;
            }
        }
        System.out.println(maxSum);
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, sp, ep + 1)));
    }


}
