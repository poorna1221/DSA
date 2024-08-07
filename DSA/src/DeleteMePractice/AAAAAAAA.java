package DeleteMePractice;

import java.util.*;
import java.util.stream.Collectors;

public class AAAAAAAA {
    public void addOneToLast() {
        int arr[] = {9, 9, 9};

        Stack<Integer> st = new Stack<>();
        int carry = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int sum = 0;
            sum = arr[i] + carry;

            if (sum > 9) {
                carry = 1;
                st.add(0);
            } else {
                carry = 0;
                st.add(sum);
            }
        }
        if (carry > 0)
            st.add(1);
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }

    public static void missingNo() {


        int actualSum = 0;
        int[] arr = {1, 5, 3, 2, 4};
        for (int i : arr)
            actualSum += i;

        System.out.println(actualSum);

    }

    public static void maxSumArray() {
        int nums[] = {-2, -3, 4, -1, -2, 5, -3};
        int sum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum = Math.max(sum, 0) + nums[i];
            maxSum = Math.max(sum, maxSum);
        }
        System.out.println("max sum is" + maxSum);

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
        String str[] = {"flght", "flgher", "flxx"};

        int lastIndex = Integer.MAX_VALUE;
        int newIndex = 0;
        for (int i = 0; i < str.length; i++) {

            char c[] = str[0].toCharArray();
            char d[] = str[i].toCharArray();

            for (int j = 0; j < Math.min(c.length, d.length); j++) {

                if (c[j] != d[j]) {
                    lastIndex = j;
                    lastIndex = Math.min(j, lastIndex);

                }
            }

        }


        System.out.println(str[0].substring(0, lastIndex));
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
