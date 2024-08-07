package amazon;

public class MaxHouseToRob {

    public static void main(String[] args) {

        int arr[] = {5, 9, 4, 1};
        int n = arr.length;
        int dp[] = new int[arr.length];
        if (n == 0)
            System.out.println("0");
        if (n == 1)
            System.out.println(arr[0]);
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], arr[i] + dp[i - 2]);
            System.out.println("i value is" + i + "max values is" + dp[i]);
        }
        System.out.println(dp[n - 1]);
    }
}
