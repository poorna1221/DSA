package amazon;

import sun.security.util.ArrayUtil;

import java.util.Arrays;
import java.util.Collections;

public class CodeToMoveZeroToEnd {
    static void tF(int[] arr) {

   /*     Arrays.sort(arr, 1, 4);

        for (int a : arr) {
            System.out.println(a);
        }*/

        Integer arr1[] = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        Arrays.sort(arr1, Collections.reverseOrder());
        for (int a : arr1) {
            System.out.print(a);
        }
        System.out.println("------------------");
    }

    static void sort(Integer[] arr) {

        Arrays.asList(arr).stream().sorted(Collections.reverseOrder()).forEach(e -> System.out.print(e));

    }


    static void moveToEnd() {
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

    static void moveTRight6() {
        int arr[] = {2, 3, 0, 0, 5, 0, 8};
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[k++] = arr[i];
            }
        }
        for (int i = k; i < arr.length; i++) {
            arr[k++] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 0, 0, 5, 0, 8};
        //moveToEnd();

        //moveTRight6();


    }
}
