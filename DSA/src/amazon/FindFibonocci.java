package amazon;

public class FindFibonocci {
    static int fib(int n) {

        if (n == 2 || n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }

    }


    static int dynamicProgram(int n) {

        int f[] = new int[n + 1];
        f[1] = 1;
        f[2] = 1;
        if (n == 1 || n == 2) {
            return 1;
        }
        for (int i = 3; i <= n; i++) {

            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n];
    }

    static int printSeries(int n, int numberOfElements) {
        int f[] = new int[numberOfElements + 1];
        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i <= numberOfElements; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n];
    }

    public static void main(String[] args) {
        int n = 9;
        int numberOfElements = 10;
        System.out.println(fib(8));
        System.out.println(dynamicProgram(4));

        //System.out.println(fib(n));
        //System.out.println(dynamicProgram(n));
     /*   for (int i = 0; i <= 10; i++) {

            System.out.print(printSeries(i, numberOfElements));
        }*/
    }
}
