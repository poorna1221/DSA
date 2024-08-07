package amazon;

import java.util.Arrays;

public class MiddleFunction {
    static int[] middle(int[] arr) {

        int ansArrary[] = new int[2];

        for (int i = 1; i < (arr.length - 1); i++) {
            ansArrary[i - 1] = arr[i];

        }

        return ansArrary;
    }

    static int[] middleArray2ndApproach(int[] arr) {

        return Arrays.copyOfRange(arr, 1, arr.length - 2);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        arr = middleArray2ndApproach(arr);
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
