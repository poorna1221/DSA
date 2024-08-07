package DeleteMePractice;

public class NumberAPalindrome {
    static void tF() {

        int number = 123;
        int reverse = 0;

        while (number > 0) {

            int remainder = number % 10;
            reverse = (reverse * 10) + (remainder);
            number = number / 10;
        }
        if (number == reverse) {
            System.out.println("panlindrome");
        }


    }

    public static void main(String[] args) {

        tF();
    }
}
