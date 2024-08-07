package amazon;

public class MissingNumberinArray {

    static void missingArrayElement() {

        int[] arr = {1, 5, 3, 2, 4};
        int actualSum = 0;
        int n = 6;
        for (int i = 0; i <= (arr.length - 1); i++) {
            actualSum += arr[i];
        }
        System.out.println("actualSum" + actualSum);

        int expectedSum = ((n) * (n + 1)) / 2; //Formula for sum of n elements

        System.out.println("Missing element is" + (expectedSum - actualSum));


    }

    public static void main(String[] args) {
        missingArrayElement();
    }
}
