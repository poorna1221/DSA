package amazon;

public class NextPalindrome {
    static void tF() {

        int n = 100;


        while (true) {

            n++;
            int nextPalindrome = n;
            int reverse = 0;

            while (nextPalindrome > 0) {
                reverse = reverse * 10 + (nextPalindrome % 10);
                nextPalindrome = nextPalindrome / 10;
            }
            if (n == reverse) {
                System.out.println("" + reverse);
                break;
            }

        }
    }

    public static void main(String[] args) {

        tF();
    }
}
