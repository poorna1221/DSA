package DeleteMePractice;

public class Factorial {
    static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        else return n * factorial(n - 1);
    }

    static int factorial_DynamicProgramming(int n) {
        int fArray[] = new int[n + 1];
        fArray[0] = 1;
        fArray[1] = 1;

        for (int i = 2; i <= n; i++) {
            fArray[i] = i * fArray[i - 1];
        }
        return fArray[n];
    }

    public static void main(String[] args) {
        int n = 20;
        System.out.println(factorial(n));
        System.out.println(factorial_DynamicProgramming(n));

    }
}
