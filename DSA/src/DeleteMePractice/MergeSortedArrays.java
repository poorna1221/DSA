package DeleteMePractice;

import java.util.Arrays;

public class MergeSortedArrays {
    static void mergeSortedArrays() {
        int arr1[] = new int[]{1, 5, 9, 10, 15, 20};
        int arr2[] = new int[]{2, 3, 8, 13};

        int finalArray[] = new int[arr1.length + arr2.length];
        int k = 0;

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                finalArray[k] = arr1[i];
                i++;
            } else {
                finalArray[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length) {
            finalArray[k] = arr1[i];
            k++;
            i++;
        }
        while (j < arr2.length) {
            finalArray[k] = arr1[j];
            k++;
            j++;
        }

        System.out.println("" + Arrays.toString(finalArray));
    }

    public static void main(String[] args) {

        mergeSortedArrays();
    }
}
