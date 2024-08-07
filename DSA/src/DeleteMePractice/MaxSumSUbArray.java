package DeleteMePractice;

import java.util.Arrays;

public class MaxSumSUbArray {
    static void maxSumSubArray() {
        
        int nums[] = {-2, -3, 2, 4, -1};
        //int nums[] = {-2, 3, 2, 4};
        int current = nums[0], maxSum = nums[0];
        int startIndex = 0;
        int endIndex = 0;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > current + nums[i]) {
                startIndex = i;
            }

            current = Math.max(current + nums[i], nums[i]);

            if (current > maxSum) {
                maxSum = current;
                endIndex = i;
            }
        }

        System.out.println("maxSum" + maxSum);
        System.out.println("endIndex is " + endIndex);
        int outputArray[] = Arrays.copyOfRange(nums, startIndex, (endIndex + 1));
        System.out.println("" + Arrays.toString(outputArray));
    }

    public static void main(String[] args) {


        maxSumSubArray();
    }
}
