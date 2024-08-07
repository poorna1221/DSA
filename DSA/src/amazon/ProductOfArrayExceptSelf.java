package amazon;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    static void tF2(int arr[]) {

        int answerArray[] = new int[arr.length];
        int product = 1;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            product = 1;
            j = i;
            while (j >= 0) { //multiply all the left side of an element to product
                j--; // Take element and Decrement element so it won't be considered in multiplication
                //iterate left hand side till starting position and mulitply all elements on left side
                if (j >= 0)
                    product = product * arr[j];

            }
            j = i;
            while (j < arr.length - 1) {
                j++; //Take same element and increament it so it won't be considered in multiplication
                //iterate right hand side and multiply alll elements on right side
                product = product * arr[j];

            }
            answerArray[i] = product;

        }
        System.out.println(Arrays.toString(answerArray));
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5};
        tF2(arr);

    }
}
