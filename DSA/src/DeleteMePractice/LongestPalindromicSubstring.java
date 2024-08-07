package DeleteMePractice;

public class LongestPalindromicSubstring {
    static int maxLength = 0, tempLength = 0;
    static int startingPosition = 0;
    static String str = "BAG";

    static void longestPalindromicSubString() {


        for (int i = 0; i < str.length(); i++) {

            checkLength(str, i, i);
            checkLength(str, i, i + 1);
        }


    }

    public static void checkLength(String str, int leftPosition, int rightPosition) {

        while (leftPosition >= 0 && rightPosition < str.length() - 1 && str.charAt(leftPosition) == str.charAt(rightPosition)) {

            leftPosition--;
            rightPosition++;

        }


        if (maxLength < (rightPosition - leftPosition - 1)) {
            startingPosition = leftPosition + 1;
            maxLength = rightPosition - leftPosition - 1;
        }

    }

    public static void main(String[] args) {
        longestPalindromicSubString();
        System.out.println("" + str.substring(startingPosition, (startingPosition + maxLength)));
    }
}
