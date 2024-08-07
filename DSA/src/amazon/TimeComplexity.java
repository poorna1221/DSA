package amazon;

public class TimeComplexity {
    static void tF() {

        int i = 1, k = 1;
        int n = 100;

        while (k < n) {
            System.out.println("k is " + k);
            k = k + i;
            i++;
        }
    }

    static void tF2() {

        int n = 100;
        for (int i = 1, k = 1; k < n; k = k + i, i++) {
            System.out.println("k is " + k);
        }
    }

    static void tF3() {
        int n = 50;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("i is " + i + " and j is" + j);
            }
        }
    }

    public static void main(String[] args) {
        tF3();
        System.out.println("---------");

    }
}
