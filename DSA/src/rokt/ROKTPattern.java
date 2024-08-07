package rokt;

public class ROKTPattern {
    String patternMatch = ".";

    public boolean isDigitOrSpecialChar(char c) {

        if (Character.isDigit(c) || patternMatch.indexOf(c) != -1) {
            return true;
        } else return false;
    }

    public boolean test(String pattern, String str) {
        boolean isMatching = true;
        StringBuilder sb = new StringBuilder();
        for (int i = 0, j = 0; i < pattern.length(); ) {

            char c = pattern.charAt(i);
            char d = str.charAt(j);

            if (Character.isDigit(c) || patternMatch.indexOf(c) != -1) {

                if (patternMatch.indexOf(c) != -1) {
                    i++;
                    j++;
                } else {
                    while (i < pattern.length() && Character.isDigit(pattern.charAt(i))) {
                        sb.append(pattern.charAt(i));
                        i++;
                    }
                    j = j + Integer.parseInt(sb.toString());
                }


            } else {
                i++;
                j++;
                if (c != d) {
                    isMatching = false;
                    break;
                }
            }

        }

        if (isMatching)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        ROKTPattern s = new ROKTPattern();
        System.out.println(s.test("rokt", "rokt"));
        System.out.println(s.test("foo", "rokt"));
        System.out.println(s.test("r.kt", "rokt"));
        System.out.println(s.test("r.kt", "rakt"));
        System.out.println(s.test("r.kt", "rzkt"));
        System.out.println(s.test("r..t", "rokt"));
        //System.out.println(s.test("rokt.", "rokt"));
        System.out.println(s.test("...", "rokt"));
        // System.out.println(s.test(".", ""));
        //System.out.println(s.test("", "f"));
        System.out.println(s.test("r1kt", "rokt"));
        System.out.println(s.test("r2t", "rokt"));
        System.out.println(s.test("1ok1", "rokt"));
        System.out.println(s.test("i18n", "internationalization"));
        System.out.println(s.test("f10z10", "fxxxxxxxxxxzxxxxxxxxxx"));
    }
}
