package amazon;

public class FindSumBetweenTwoIndices {
    static void bruteForce(int startIndex, int endIndex) {

        int nums[] = {-2, 0, 3, -5, 2, -1};
        int sum[] = new int[nums.length + 1];
        int sumTotal = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            sumTotal += nums[i];
        }
        System.out.println(sumTotal);
    }

    static void FindSumBetweenTwoIndices() {

        int nums[] = {1, 2, 3, 4, 5, 6};//0,1,3,6,10,15,21
        int sum[] = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }
        sumRange(2, 4, sum);

    }

    public static void sumRange(int i, int j, int arr[]) {
        System.out.println(arr[j + 1] - arr[i]);

    }

    public static void main(String[] args) {

        FindSumBetweenTwoIndices();
    }
}
