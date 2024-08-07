package sortingalgoriths;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SortArray {
    static void arraySort() {
        int arr[] = {3, 2, 5, 8, 1, 6, 9, 4, 15, 11};
        Arrays.sort(arr);

        Arrays.sort(arr, 2, 7); //To sort sub array use this Arrays.sort(arr, from index, Toindex) - From index included, ToIndex is excluded. Means Toindex -1 elements will be sorted.

        for (int b : arr) {
            System.out.println(b);
        }
        System.out.println(Arrays.binarySearch(arr, 99));
    }


    public static void main(String[] args) {

        int arr[] = {3, 2, 5, 8, 1, 6, 9, 4, 15, 11};
        Arrays.sort(arr);
        for (int a : arr) {
            //System.out.println(a);
        }

        System.out.println(Arrays.binarySearch(arr, 3));
    }
}
