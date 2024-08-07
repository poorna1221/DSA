package amazon;

import java.util.Arrays;

public class maxSumSubArray {
    static int sum = 0, maxSum = Integer.MIN_VALUE;

    static int maxSumSubArray(int nums[]) {
        for (int num : nums) {
            sum = Math.max(sum, 0) + num;
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int nums[] = {-3, 4};
        System.out.println(maxSumSubArray(nums));
        mxSum(nums);
    }

    static void mxSum(int nums[]) {

        int current = nums[0], maxsum = nums[0];
        int sp = 0, ep = 0;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > current + nums[i]) {
                sp = i;
            }

            current = Math.max(current + nums[i], nums[i]);

            if (current > maxsum) {
                maxsum = current;
                ep = i;
            }
        }
        System.out.println("maxsum is" + maxsum);
        System.out.println("Array is" + Arrays.toString(Arrays.copyOfRange(nums, sp, ep + 1)));

    }
}
