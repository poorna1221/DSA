package amazon;

public class WildcardChars {
    // Recursive function to check if the input string matches
    // with a given wildcard pattern
    public static boolean isMatch(String word, int n, String pattern, int m) {
        // end of the pattern is reached
        if (m == pattern.length()) {
            // return true only if the end of the input string is also reached
            return n == word.length();
        }

        // if the input string reaches its end, return when the
        // remaining characters in the pattern are all '*'
        if (n == word.length()) {
            for (int i = m; i < pattern.length(); i++) {
                if (pattern.charAt(i) != '*') {
                    return false;
                }
            }

            return true;
        }

        // if the current wildcard character is '?' or the current character in
        // the pattern is the same as the current character in the input string
        if (pattern.charAt(m) == '?' || pattern.charAt(m) == word.charAt(n)) {
            // move to the next character in the pattern and the input string
            return isMatch(word, n + 1, pattern, m + 1);
        }

        // if the current wildcard character is '*'
        if (pattern.charAt(m) == '*') {
            // move to the next character in the input string or
            // ignore '*' and move to the next character in the pattern
            return isMatch(word, n + 1, pattern, m) || isMatch(word, n, pattern, m + 1);
        }

        // we reach here when the current character in the pattern is not a
        // wildcard character, and it doesn't match the current
        // character in the input string
        return false;
    }

    // Check if a string matches with a given wildcard pattern
    public static boolean isMatch(String word, String pattern) {
        return isMatch(word, 0, pattern, 0);
    }

    public static void main(String[] args) {
        System.out.println(isMatch("XYXY", "X*Y"));    // true
        System.out.println(isMatch("XYXZZXY", "X*ZZ?X"));
    /*    System.out.println(isMatch("XYXZZXY", "X*ZZ??"));   // true
        System.out.println(isMatch("XYXZZXY", "*X*X?"));    // true
        System.out.println(isMatch("XYXZZXY", "X***X"));    // false
        System.out.println(isMatch("XYXZZXY", "*"));        // true
    */
    }
}