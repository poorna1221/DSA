package leetcode;

public class HouseRobbery {

    public void explanation() {
     /*    //https://www.geeksforgeeks.org/find-maximum-possible-stolen-value-houses/
    /*
    There are n houses build in a line, each of which contains some value in it. A thief is going to steal the maximal value of these houses, but he can’t steal in two adjacent houses because the owner of the stolen houses will tell his two neighbors left and right side. What is the maximum stolen value?

Examples:

Input: hval[] = {6, 7, 1, 3, 8, 2, 4}
Output: 19

Explanation: The thief will steal 6, 1, 8 and 4 from the house.

Input: hval[] = {5, 3, 4, 11, 2}
Output: 16

Explanation: Thief will steal 5 and 11*/
    }

    public int dp_BottomUp(int arr[]) {
        int dp[] = new int[arr.length];
        int totalHouse = arr.length;
        if (totalHouse == 0) {
            return 0;
        }
        if (totalHouse == 1) {//If one house take that value and return
            return arr[0];
        }
        if (totalHouse == 2) {//If two houses take max value from house 1 or from house 2
            return Math.max(arr[0], arr[1]);
        }
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) {
            dp[i] = Math.max(arr[i] + dp[i - 2], dp[i - 1]);//if 3 houses take current value+arr[n-2]
            // because if I choose current house I can't choose preiovus house hence choosing current
            // value of array arr[i] + value from 2 houses away which is dp[i-2] or take max value as of previous house arr[i-1]
            //if I don't select current house
            System.out.println("i is " + i + "dp value is" + dp[i]);
        }
        return dp[arr.length - 1];
    }

    public static void main(String[] args) {
        HouseRobbery hr = new HouseRobbery();
        int hval[] = {9, 6, 1, 5};
        int maxStolenValue = hr.dp_BottomUp(hval);
        System.out.println("maxStolenValue is " + maxStolenValue);

    }
}
