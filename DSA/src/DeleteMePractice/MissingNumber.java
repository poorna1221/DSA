package DeleteMePractice;

public class MissingNumber {
    static void MissingNumber() {
        int[] arr = {1, 3, 2, 4};
        int n = 5;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;
        for (int i : arr)
            actualSum += i;

        System.out.println("Missing nUmber " + (expectedSum - actualSum));
    }

    public static void main(String[] args) {

        MissingNumber();
    }
}
