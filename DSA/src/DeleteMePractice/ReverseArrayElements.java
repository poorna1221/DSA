package DeleteMePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReverseArrayElements {
    static void ReverseArrayElements() {
        String str = "Pocrna";
        char c[] = str.toCharArray();
        int mid = str.length() / 2;


        for (int i = 0; i < mid; i++) {
            int endIndex = str.length() - i - 1;
            char temp = c[i];
            c[i] = c[endIndex];
            c[endIndex] = temp;

        }
        System.out.println(Arrays.toString(c));
    }

    static void reverseNumber() {
        int n = 456;

        int reverse = 0;
        int remainder = 0;

        while (n > 0) {

            remainder = (remainder * 10) + n % 10;
            n = n / 10;
        }
        System.out.println("" + remainder);
    }

    public static void main(String[] args) {
        reverseNumber();

    }
}
