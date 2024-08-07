package amazon;

public class


LongestPalindromicSubString {


    int startingPosition = 0;
    int maxLength = 0;

    public void longestPalindromicSubString() {

        String str = "ABBOBBA";
        for (int i = 0; i < str.length(); i++) {
            checkLength(str, i, i);
            checkLength(str, i, i + 1);
        }
        System.out.println("palindrome is" + str.substring(startingPosition, maxLength + startingPosition));
    }

    public void checkLength(String str, int left, int right) {

        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }

        if (maxLength < (right - left - 1)) {
            startingPosition = left + 1;
            maxLength = right - left - 1;
        }
    }

    public static void main(String[] args) {
        LongestPalindromicSubString ls = new LongestPalindromicSubString();
        ls.longestPalindromicSubString();

    }
}
