package amazon;

public class SubArrayWithGivenSum {


    public static void main(String[] args) {
        int arr[] = {1, 4, 20, 3, 10, 5};
        int targetSum = 33;
        int left = 0, right = 0;
        int currentSum = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            currentSum += arr[i];
            if (currentSum < targetSum) {
                right = arr[i];
            } else {
                currentSum = currentSum - arr[left];
                left += 1;

            }

        }
    }
}
