/*
package sortingalgoriths;

import java.util.Random;

public class QuickSort {
    static void printArrary(int arr[]) {
        for (int a : arr) {
            System.out.println(a);
        }

    }

    static void quickSort(int inputArray[]) {

        int lowIndex = 0;
        int highIndex = inputArray.length - 1;

        int pivot = inputArray[highIndex];

        while (lowIndex < highIndex) {
            while (inputArray[lowIndex] <= pivot && lowIndex < highIndex) {

                lowIndex++;
            }
            while (inputArray[highIndex] >= pivot && lowIndex < highIndex) {
                highIndex--;
            }
        }

        swap(inputArray, lowIndex, highIndex);
        swap(inputArray,);


    }

    static void swap(int arr[], int leftIndex, int rightIndex) {
        int temp = arr[leftIndex];
        arr[leftIndex] = arr[rightIndex];
        arr[rightIndex] = temp;
    }

    public static void main(String[] args) {

        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
        }
        printArrary(arr);
        quickSort(arr);

    }
}
*/
