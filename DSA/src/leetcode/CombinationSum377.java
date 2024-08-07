package leetcode;

public class CombinationSum377 {


    public int combinationSum4(int[] nums, int target) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int[] dp = new int[target + 1];
        java.util.Arrays.fill(dp, 0);
        dp[0] = 1;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] <= i) {
                    dp[i] += dp[i - nums[j]];
                    ///System.out.println(dp[i]);
                }
            }
        }
        return dp[target];
    }

    public static void main(String[] args) {

        CombinationSum377 s = new CombinationSum377();
        int arr[] = {1, 2, 3};
        int target = 4;
        System.out.println(s.combinationSum4(arr, target));

    }
}
