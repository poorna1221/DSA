package DeleteMePractice;

import java.util.Arrays;
import java.util.Collections;

public class CodeToMoveZeroToEnd {


    public static void main(String[] args) {
        int arr[] = {2, 3, 0, 0, 5, 0, 8};
        int k = 0;
        for (int i : arr) {
            if (i != 0) {
                arr[k++] = i;
            }
        }

        for (int i = k; i < arr.length; i++) {
            arr[k++] = 0;
        }

        System.out.println(Arrays.toString(arr));


    }
}
