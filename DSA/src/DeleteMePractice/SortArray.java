package DeleteMePractice;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {
    static void sort(int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    static void sortAr(int arr[]) {

        Integer arr1[] = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arr1, Collections.reverseOrder());
        for (int i : arr1) {
            System.out.print(i);
        }
    }


    public static void main(String[] args) {
        int arr[] = {4, 2, 3, 5, 1, 9, 8, 6};
        sort(arr);
        sortAr(arr);

    }
}
