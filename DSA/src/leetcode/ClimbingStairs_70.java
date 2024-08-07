package leetcode;

public class ClimbingStairs_70 {
    public int climbStairs(int n) {

        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        ClimbingStairs_70 cs = new ClimbingStairs_70();
        int s = 5;
        System.out.println(cs.climbStairs(s));
    }
}
