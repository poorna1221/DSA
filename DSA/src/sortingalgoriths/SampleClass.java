package sortingalgoriths;

import java.util.*;

public class SampleClass {

    public static void main(String[] args) {
        int[] arr = {4, 7, 6, 3, 9, 5, 1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i : arr)
            System.out.println(i);

    }


}
