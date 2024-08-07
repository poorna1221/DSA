package DeleteMePractice;

import java.util.Arrays;
import java.util.Collections;

public class CodeToMoveZerosToEnd {
    static void codeToMoveZerosToEnd(int arr[]) {

        int left = 0, right = arr.length - 1;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[k++] = arr[i];
            }
        }
        for (int i = k; i < arr.length; i++) {
            arr[k++] = 0;
        }
        System.out.println("" + Arrays.toString(arr));
    }


    static void codeToMoveZerosToLeft(int arr[]) {


        int k = arr.length - 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[k--] = arr[i];
            }
        }
        while (k >= 0) {
            arr[k--] = 0;
        }

        System.out.println("" + Arrays.toString(arr));
    }

    static void codeToMoveZeros_ArraySort(int arr[]) {

        Integer arr1[] = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arr1, Collections.reverseOrder());
        System.out.println("" + Arrays.toString(arr1));
    }

    public static void main(String[] args) {

        int arr[] = {1, 8, 0, 6, 0, 2, 0, 9, 0};
        codeToMoveZerosToEnd(arr);
        codeToMoveZerosToLeft(arr);
        codeToMoveZeros_ArraySort(arr);
    }
}
