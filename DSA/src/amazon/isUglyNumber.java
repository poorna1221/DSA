package amazon;// Java program to implement a stack that supports
// getMaximum() in O(1) time and O(1) extra space.

import java.util.Stack;

class isUglyNumber {


    public static void main(String[] args) {
//Ugly number is a number whose prime factors are limited to 2,3 & 5
        //https://www.youtube.com/watch?v=q_BoJBNTU_g&list=PLR0u9sleZ_VCqlwJv5y-ITzIerq1D1Ibw&index=71
        int n = 15;

        while (n % 5 == 0) n = n / 5;
        while (n % 3 == 0) n /= 3;
        while (n % 2 == 0) n /= 2;

        if (n == 1) {
            System.out.println("ugly number");
        } else {
            System.out.println("not ugly");

        }
    }
}
 