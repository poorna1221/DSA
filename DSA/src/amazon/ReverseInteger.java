package amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseInteger {
    static void revereString() {
        String str = "Poorna";
        String[] arr = str.split("");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
        System.out.println("-----------");
    }


    static void revereString2() {
        String str = "Poorna";
        char[] arr = str.toCharArray();

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
        System.out.println("-----------");
    }

    static void revereString3() {
        String str = "Poorna";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());

    }

    static void reverseString() {
        String str = "Poorna";

        char arr[] = str.toCharArray();
        int mid = arr.length / 2;
        for (int i = 0; i < mid; i++) {
            int endIndex = arr.length - i - 1;
            char c = arr[i];
            arr[i] = arr[endIndex];
            arr[endIndex] = c;
        }

        System.out.println(Arrays.toString(arr));
    }

    static void plusoneToLastInteger() {
        List<Integer> list = new ArrayList<>();

        int arr[] = {1, 2, 9, 8, 6, 4};

        for (int i : arr) {
            list.add(0, i);
        }

        System.out.println(list);
    }

    public static void main(String[] args) {
        int n = 456, reverse = 0, remainder = 0;
        while (n > 0) {

            reverse = reverse * 10 + (n % 10);
            n = n / 10;

        }
        //System.out.println(reverse);
        plusoneToLastInteger();

    }
}
