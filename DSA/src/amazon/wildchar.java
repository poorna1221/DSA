package amazon;

public class wildchar {
    static boolean isMatch(String str, int strPosition, String pattern, int patternPosition) {

        if (patternPosition == pattern.length()) {
            if (strPosition == str.length()) {
                //System.out.println("Strings are matching");
                return true;
            } else {
                System.out.println("not matching");
                return false;
            }
        }

        if (strPosition == str.length()) {
            boolean matching = true;
            for (int i = patternPosition; i < pattern.length(); i++) {
                if (pattern.charAt(patternPosition) != '*') {
                    matching = false;

                }
            }
            if (matching) {
                //System.out.println("Strings are matching");
                return true;
            } else {
                System.out.println("not matching");
                return false;
            }

        }

        if (pattern.charAt(patternPosition) == '?' || pattern.charAt(patternPosition) == str.charAt(strPosition)) {
            return isMatch(str, strPosition + 1, pattern, patternPosition + 1);
        }

        if (pattern.charAt(patternPosition) == '*') {
            return isMatch(str, strPosition + 1, pattern, patternPosition) || isMatch(str, strPosition, pattern, patternPosition + 1);
        }

        return false;
    }

    public static void main(String[] args) {

        String str = "XYXZZXY";
        String pattern = "X***X";

        System.out.println(isMatch(str, 0, pattern, 0));
        System.out.println(isMatch("XYXZZXY", 0, "X***Y", 0));    // true
        System.out.println(isMatch("XYXZZXY", 0, "X*ZZ??", 0));   // true
        System.out.println(isMatch("XYXZZXY", 0, "*X*X?", 0));    // true
        System.out.println(isMatch("XYXZZXY", 0, "X***X", 0));    // false
        System.out.println(isMatch("XYXZZXY", 0, "*", 0));        // true
    }
}
