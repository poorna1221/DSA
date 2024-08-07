package amazon;

public class MergeSortedArrays {
    static int[] tF(int leftArray[], int rightArray[]) {


        int lArrarylength = leftArray.length;
        int rArrarylength = rightArray.length;

        int mergedArray[] = new int[lArrarylength + rArrarylength];

        int i = 0, j = 0, k = 0;
        while (i < lArrarylength && j < rArrarylength) {
            if (leftArray[i] < rightArray[j]) {
                mergedArray[k] = leftArray[i];
                i++;
            } else {
                mergedArray[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < lArrarylength) {
            mergedArray[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < rArrarylength) {
            mergedArray[k] = rightArray[j];
            j++;
            k++;
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int arr1[] = new int[]{1, 5, 9, 10, 15, 20};
        int arr2[] = new int[]{2, 3, 8, 13};
        int ar[] = tF(arr1, arr2);

        for (int i : ar) {
            System.out.print(i + "  ");
        }

    }


}
