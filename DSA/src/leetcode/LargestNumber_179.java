package leetcode;

import java.util.Arrays;

public class LargestNumber_179 {


    public String largestNumber_2(int[] nums) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                String a = String.valueOf(nums[i]);
                String b = String.valueOf(nums[j]);
                String ab = a + b;
                String ba = b + a;
                if (ab.compareTo(ba) == 1) {
                    System.out.println("Do not swap");
                } else {
                    swapArrayValues(nums, i, i + 1);
                }
            }
        }

        for (int x : nums) {
            output.append(x);
        }
        return output.toString();
    }//not working

    public String largestNumber(int[] nums) {
        if (nums.length == 0) {
            return "";
        }
        String strArr[] = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strArr[i] = Integer.toString(nums[i]);
        }

        Arrays.sort(strArr, (a, b) -> {

            String x = a + b;
            String y = b + a;
            return y.compareTo(x);
        });

        if (strArr[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (String s : strArr) {
            sb.append(s);
        }

        return sb.toString();

    }

    public void swapArrayValues(int arr[], int a, int b) {

        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;

    }

    public static void main(String[] args) {
        LargestNumber_179 s = new LargestNumber_179();
        int arr[] = {3, 30, 34, 9};
        System.out.println(s.largestNumber(arr));
    }
}
