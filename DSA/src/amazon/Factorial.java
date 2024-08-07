package amazon;

public class Factorial {

    static int memo[] = new int[36];

    static int factorial(int n) {

        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return 1;
        } else {

            return n * factorial(n - 1);

        }
    }

    static int factorialDP(int n) {
        int fact[] = new int[n + 1];

        fact[0] = 1;
        fact[1] = 1;
        for (int i = 2; i <= n; i++) {
            fact[i] = i * fact[i - 1];
        }
        return fact[n];
    }

    static int factorial_Rec(int n) {
        if (n < 0) return -1;
        if (n == 1 || n == 0) return 1;
        else return n * factorial_Rec(n - 1);

    }

    static int factorial_bottomUp(int n) {//Tabulation
        int fact[] = new int[n + 1];
        fact[0] = 1;
        fact[1] = 1;
        for (int i = 2; i <= n; i++) {
            fact[i] = i * fact[i - 1];
        }
        return fact[n];
    }

    static int factorial_TopDown(int n) {//Memoization or TopDown up

        if (n == 1 || n == 0) return 1;
        else if (memo[n] != 0) {
            return memo[n];
        } else
            memo[n] = n * (n - 1);
        return memo[n];
    }


    public static void main(String[] args) {
        int n = 35;
        //int nFactorial = factorial(n);
        System.out.println(factorial_Rec(n));
        System.out.println(factorial_bottomUp(n));
        System.out.println(factorial_TopDown(n));

    }
}
