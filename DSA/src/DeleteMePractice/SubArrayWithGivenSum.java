package DeleteMePractice;

import java.util.Arrays;

public class SubArrayWithGivenSum {
    static void tF(int arr[]) {

        int answer[] = new int[arr.length];

        int product = 1;

        for (int i = 0; i < arr.length; i++) {
            answer[i] = product;
            product = product * arr[i];
            //System.out.println("arr[" + i + "] is " + answer[i]);
        }
        product = 1;

        for (int i = arr.length - 1; i >= 0; i--) {
            answer[i] = answer[i] * product;
            product = product * arr[i];
            //System.out.println("arr[" + i + "] is " + answer[i]);
        }
        System.out.println(Arrays.toString(answer));
    }

    static void tF2(int arr[]) {

        int answerArray[] = new int[arr.length];
        int product = 1;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            product = 1;
            j = i;
            while (j >= 0) {
                j--;
                if (j >= 0)
                    product = product * arr[j];

            }
            j = i;
            while (j < arr.length - 1) {
                j++;
                product = product * arr[j];

            }
            answerArray[i] = product;

        }
        System.out.println(Arrays.toString(answerArray));
    }

    static void tF3(int arr[]) {
        int answerArray[] = new int[arr.length];
        int product = 1;
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            j = i;
            while (j >= 0) {
                j--;
                if (j >= 0)
                    product = product * arr[j];

            }
            j = i;
            while (j < arr.length - 1) {
                j++;
                product = product * arr[j];
            }
            answerArray[i] = product;
        }
        System.out.println(Arrays.toString(answerArray));
    }

    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 5};
        tF(arr);
        tF2(arr);
        tF3(arr);
    }
}
