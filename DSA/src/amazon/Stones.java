package amazon;

import java.util.Arrays;

public class Stones {
    static int scoreFraz = 0;
    static boolean completed = false;

    static void stonesScore() {
        int arr[] = {6, 2, 3, 5, 4, 5, 5};
        split(arr);

        // System.out.println(Arrays.toString(leftArray));
        //System.out.println(Arrays.toString(rightArray));

    }

    static void split(int arr[]) {

        int leftArray[] = new int[arr.length / 2];
        int rightArray[] = new int[arr.length - (arr.length / 2)];
        int leftArraySum = 0, rightArraySum = 0;

        if (rightArray.length == 0) {
            completed = true;
            return;
        }
        for (int i = 0; i < (arr.length / 2); i++) {
            leftArray[i] = arr[i];
        }

        for (int i : leftArray) {
            leftArraySum += i;
        }

        for (int i = (arr.length / 2); i < arr.length; i++) {
            rightArray[i - (arr.length / 2)] = arr[i];

        }
        for (int i : rightArray) {
            rightArraySum += i;
        }
        if (rightArraySum > leftArraySum) {
            arr = leftArray;
            scoreFraz += leftArraySum;
        } else {
            arr = rightArray;
            scoreFraz += rightArraySum;
        }
   /*     System.out.print(Arrays.toString(leftArray));
        System.out.print(leftArraySum);
        System.out.println("------------");
        System.out.print(Arrays.toString(rightArray));
        System.out.print(rightArraySum);
        System.out.println("------------");*/

        split(arr);


    }

    public static void main(String[] args) {
        stonesScore();
        if (completed)
            System.out.println("Score is" + scoreFraz);
    }
}
