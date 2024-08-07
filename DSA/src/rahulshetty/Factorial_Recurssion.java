package rahulshetty;

public class Factorial_Recurssion {

    static int[] arr = {2, 1, 15, 23, 21};

    public static void main(String[] args) {

       /* int factofN = fact(5);
        System.out.println(factofN);*/

        printNumbers(5);


    }

    public static int fact(int n) {


        if (n == 0) {
            return 1;
        } else {

            return n * fact(n - 1);
        }

    }

    public static int sumofFib(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {

            return sumofFib(n - 1) + sumofFib(n - 2);
        }
    }

    public static int sum(int n) {

        if (n == 0) {
            return arr[0];
        } else {

            return arr[n] + sum(n - 1);
        }

    }

    public static void printNumbers(int n) {

        if (n >= 1) {
            printNumbers(n - 1);
            System.out.println(n);

        }
    }
}
