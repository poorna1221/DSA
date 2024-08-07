package amazon;

import java.util.Arrays;

public class ReverseStringWithRecursion {

    static void swap(char c[], int i, int j) {
        char temp = c[j];
        c[j] = c[i];
        c[i] = temp;

    }

    static void revereString(char c[], int i, int j) {
        if (i < j) {
            swap(c, i, j);
            revereString(c, i + 1, j - 1);
        }  //recursion way
       /* for (int i = 0; i < (c.length / 2); i++) {
            int lastIndex = c.length - i - 1;
            swap(c, i, lastIndex);
        }//with for loop;*/
    }

    public static void main(String[] args) {
        String str = "Poorna";
        char c[] = str.toCharArray();
        revereString(c, 0, c.length - 1);

        System.out.println("Reverse string is" + Arrays.toString(c));

    }
}
