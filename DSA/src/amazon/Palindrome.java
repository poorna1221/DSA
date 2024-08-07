package amazon;

public class Palindrome {
    static void checkPalindrome() {

        String str = "XYBYBYX";

        boolean palindrom = true;
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            System.out.println("count" + i);
            if (str.charAt(i) != str.charAt(j)) {
                palindrom = false;
            }


        }
        if (palindrom) {
            System.out.println(" palindrom");
        } else {
            System.out.println("Not palindrom");
        }

    }

    static void checkPalin() {
        String str = "XYBBX";
        StringBuilder sb = new StringBuilder(str).reverse();

        System.out.println(str);
        System.out.println(sb.toString());
        if (str.equals(sb.toString())) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }

    static void revereString() {
        String str = "A man, a plan, a canal: Panama";
        /*"A man, a plan, a canal: Panama";
           Amanaplana
        *  amanaplana
        *
        * */
        str = str.toLowerCase();
        int i = 0, j = str.length() - 1;
        boolean palindrome = true;
        while (i < j) {
            char c = str.charAt(i), d = str.charAt(j);
            if (isAlphanumeric(c)) {
                i++;
                continue;

            }
            if (isAlphanumeric(d)) {
                j--;
                continue;
            }

            if (c != d) {
                palindrome = false;
            } else {
                i++;
                j--;
            }

        }
        if (palindrome) {
            System.out.println("palindrome");
        } else System.out.println("NOT A palindrome");

    }

    static boolean isAlphanumeric(char c) {
        if (Character.isLetter(c) || Character.isDigit(c)) {
            return true;
        } else return false;

    }

    static void checkPalinWhile() {
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
        return Character.isLetter(c);
    }

    public static void main(String[] args) {
        //checkPalindrome();
        checkPalinWhile();
    }
}
