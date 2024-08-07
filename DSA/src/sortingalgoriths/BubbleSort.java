package sortingalgoriths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BubbleSort {

    static void bubbleSrt(int[] arr) {
        for (int i = 0; i < arr.length; i++) { //O(n)
            for (int j = 0; j < arr.length - i - 1; j++) {  //O(n)

                if (arr[j] > arr[j + 1]) {
                    //System.out.println("Before " + arr[j] + "  and " + arr[j + 1]);
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // System.out.println("After " + arr[j] + "  and " + arr[j + 1]);

                }
            }
            System.out.println("Array after first loop is" + Arrays.toString(arr));

        }
    }

    static void printArr(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr = {4, 7, 6, 3, 9, 5, 1};

        bubbleSrt(arr);
        //printArr(arr);
        //here time complexity is o(n2) space complexity is o(1)

    }
}
