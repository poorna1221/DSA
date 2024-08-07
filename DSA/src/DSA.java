public class DSA {

    static void recursiveMethod(int n) {
        if (n < 1) {
            System.out.println("n is less than 1");
        } else {

            recursiveMethod(n - 1);
            System.out.println("n is " + n);
        }
    }

    public static void main(String args[]) {

        recursiveMethod(3);

    }
}
