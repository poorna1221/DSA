package amazon;

public class AddDigits {
    static void digitalRoots(int n) {


        if (n % 9 == 0) {
            System.out.println("Sum is 9");
        } else {
            System.out.println("sum is " + (n % 9));
        }

    }

    public static void main(String[] args) {

        int n = 321, sum = 0, newSum = Integer.MAX_VALUE;
        while (newSum > 10) {//this is needed only when the final value should be signle digit else, just below code is enough

            while (n > 0) {
                sum = sum + n % 10;
                n = n / 10;
            }
            newSum = sum;
            n = sum;
            sum = 0;
            System.out.println("n is" + newSum);
        }
        System.out.println(newSum);
        digitalRoots(n);
    }
}
