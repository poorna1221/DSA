package DeleteMePractice;

public class PanlindromePrograms {
    static void checkPalindrome() {
        boolean mismatch = false;
        String str = "BOCB";
        int mid = (0 + str.length() / 2);
        int endIndex = str.length() - 1;
        for (int i = 0; i < mid; i++, endIndex--) {
            if (str.charAt(i) != str.charAt(endIndex)) {
                mismatch = true;
            }
        }
        if (mismatch) {
            System.out.println("not a palindrome");
        } else {
            System.out.println("palindrome");
        }
    }

    static void checkPalindrome_SB() {
        String str = "BOoB";

        if (str.equals(new StringBuilder(str).reverse().toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not");
        }
    }

    static void checkPalin() {
        String str = "A man, a plan, a canal: Panama";
        // String str = "BOOB";
        int length = str.length();
        int i = 0;
        int j = length - 1;
        boolean palindrome = true;
        String newString = str.toLowerCase();
        while (i >= 0 && i < j) {

            while (!isLetter(newString.charAt(i))) {
                i++;
            }
            while (!isLetter(newString.charAt(j))) {
                j--;
            }
            char s = newString.charAt(i);
            char e = newString.charAt(j);
            if (s != e) {
                palindrome = false;
                break;
            } else {
                i++;
                j--;
            }

        }
        if (palindrome) {
            System.out.println("palindrome");
        } else System.out.println("not a palindrome");

    }

    static boolean isLetter(char c) {
        if (Character.isLetter(c)) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        checkPalin();

    }
}
