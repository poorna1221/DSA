package leetcode;

public class DivideTwoIntegers_29 {


    public int divide(int dividend, int divisor) {


        return Math.round(dividend / divisor);
//not finished
    }

    public static void main(String[] args) {
        DivideTwoIntegers_29 s = new DivideTwoIntegers_29();
        System.out.println(s.divide(7, -3));

    }
}
