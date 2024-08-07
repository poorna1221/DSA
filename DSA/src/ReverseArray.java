import java.util.Arrays;

import static java.lang.Math.max;

public class ReverseArray {

    static void reverse(int[] a) {

        for (int i = 0; i < a.length / 2; i++) {
            int endIndex = a.length - i - 1;
            int temp = a[i];
            a[i] = a[endIndex];
            a[endIndex] = temp;


        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String args[]) {
        int[] a = {1, 5, 6, 9, 4};
        reverse(a);

    }
}
