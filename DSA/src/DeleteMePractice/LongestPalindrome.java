package DeleteMePractice;

public class LongestPalindrome {


    static public void longestPalindrome() {
        String str = "ABBOBBA";

        int midElement = 0;
        if (str.length() % 2 == 0) {
//            midElement = str.length() / 2;
        } else {
            midElement = str.length() / 2;
        }

        findPal(str, midElement, midElement);
    }

    static public void findPal(String str, int left, int right) {


        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }

        System.out.println(str.substring(left + 1, left + (right - left)));

    }

    public static void main(String[] args) {
        longestPalindrome();

    }
}
