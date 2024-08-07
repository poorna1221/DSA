package DeleteMePractice;

public class wild {
    static boolean isMatch(String string, String pattern) {

        return isMatch(string, 0, pattern, 0);
    }

    static boolean isMatch(String string, int s, String pattern, int p) {

        if (p == pattern.length()) {
            return s == string.length();
        }
        if (s == string.length()) {
            for (int i = p; i < pattern.length(); i++) {
                if (pattern.charAt(i) != '*')
                    return false;
            }
            return true;
        }

        while (pattern.charAt(p) == '?' || string.charAt(s) == pattern.charAt(p)) {
            return isMatch(string, s + 1, pattern, p + 1);
        }

        while (pattern.charAt(p) == '*') {
            return isMatch(string, s + 1, pattern, p) || isMatch(string, s, pattern, p + 1);
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(isMatch("XYXY", "X*Y"));    // true

    }
}
