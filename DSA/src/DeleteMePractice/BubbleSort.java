package DeleteMePractice;

public class BubbleSort {

    public static void sortArray(int arr[], int N) {

        // Traverse the array
        for (int i = 0; i < N; ) {

            // If the current element is
            // at correct position
            if (arr[i] == i + 1) {
                i++;
            }

            // Else swap the current element
            // with it's correct position
            else {
                // Swap the value of
                // arr[i] and arr[arr[i]-1]
                int temp1 = arr[i];
                int temp2 = arr[arr[i] - 1];
                arr[i] = temp2;
                arr[temp1 - 1] = temp1;
            }
        }
    }

    static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.println(i);
        }

    }

    public static void main(String args[]) {


        int arr[] = {2, 1, 5, 3, 4};
        int N = arr.length;

        // Function call to sort the array
        sortArray(arr, N);

        // Function call to print the array
        printArray(arr);
    }
}