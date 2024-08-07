package rahulshetty;

public class SumofNaturalNumbersUsingRecurssion {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
    }

    public static int sum(int n) {

        if (n <= 1) {
            return n;
        } else {
            return n + sum(n - 1);
        }
    }
}
