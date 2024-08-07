package sortingalgoriths;

import java.util.Date;
import java.util.Random;

public class MergeSortClass {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void mergeSort(int[] inputArrary) {
        int inputArraySize = inputArrary.length;

        if (inputArraySize < 2) {
            return;
        }
        int midIndex = inputArraySize / 2;
        int leftArrary[] = new int[midIndex];
        int rightArrary[] = new int[inputArraySize - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftArrary[i] = inputArrary[i];
        }

        for (int i = midIndex; i < inputArraySize; i++) {
            rightArrary[i - midIndex] = inputArrary[i];
        }

        mergeSort(leftArrary);
        mergeSort(rightArrary);
        merge(inputArrary, leftArrary, rightArrary);
    }

    public static void merge(int inputArray[], int leftArrary[], int rightArrary[]) {

        int leftArrarySize = leftArrary.length;
        int rightArrarySize = rightArrary.length;
        int i = 0, j = 0, k = 0;
        while (i < leftArrarySize && j < rightArrarySize) {
            if (leftArrary[i] <= rightArrary[j]) {
                inputArray[k] = leftArrary[i];
                i++;
            } else {
                inputArray[k] = rightArrary[j];
                j++;
            }
            k++;
        }

        while (i < leftArrarySize) {
            inputArray[k] = leftArrary[i];
            i++;
            k++;
        }
        while (j < rightArrarySize) {
            inputArray[k] = rightArrary[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args) {
        Random rand = new Random();
        int inputArrary[] = {9, 4, 7, 6};
       /* int[] inputArrary = new int[10];
        for (int i = 0; i < inputArrary.length; i++) {
            inputArrary[i] = rand.nextInt(1000000000);
        }*/
        System.out.println("Before Sort");
        //printArray(inputArrary);

        long Before = (new Date().getTime()) / 1000;
        mergeSort(inputArrary);
        long after = (new Date().getTime()) / 1000;
        System.out.println(after - Before);


        printArray(inputArrary);
    }
}
