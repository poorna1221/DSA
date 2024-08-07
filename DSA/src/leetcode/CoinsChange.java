package leetcode;

import java.util.Arrays;

public class CoinsChange {

    public void explanation() {
        /*https://www.youtube.com/watch?v=1R0_7HqNaW0
        You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.

Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

You may assume that you have an infinite number of each kind of coin.
         */
    }

    public int coinsChange(int coins[], int amount) {
        int dp[] = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 0; i <= amount; i++) {

            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
                } else break;
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        CoinsChange s = new CoinsChange();
        int coins[] = {1, 2, 5};
        int amount = 11;
        System.out.println(s.coinsChange(coins, amount));
    }
}
