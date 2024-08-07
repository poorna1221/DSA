package rokt.rokt;

public class Pattern1 {

    /*System.out.println(p.pattern_match("rokt", "rokt")); => True
    System.out.println(p.pattern_match("foo", "rokt")) => False
    System.out.println(p.pattern_match("r.kt", "rokt")) => True
    System.out.println(p.pattern_match("r.kt", "rakt")) => True
    System.out.println(p.pattern_match("r.kt", "rzkt")) => True
    System.out.println(p.pattern_match("r..t", "rokt")) => True
    System.out.println(p.pattern_match("rokt.", "rokt")) => False
    System.out.println(p.pattern_match("...", "rokt")) => False
    System.out.println(p.pattern_match("", "")) => True
    System.out.println(p.pattern_match(".", "")) => False
    System.out.println(p.pattern_match("", "f"))=>False*/
    public boolean pattern_match(String pattern, String str) {
        if (pattern.length() != str.length()) {
            return false;
        }
        for (int i = 0, j = 0; i < pattern.length(); ) {

            char c = pattern.charAt(i);
            char d = str.charAt(j);
            if (c == '.') {
                i++;
                j++;
            } else {
                i++;
                j++;
                if (c != d) {
                    return false;
                }
            }

        }
        return true;
    }

    public static void main(String args[]) {
        Pattern1 p = new Pattern1();


        System.out.println(p.pattern_match("foo", "rokt"));
        System.out.println(p.pattern_match("r.kt", "rokt"));
        System.out.println(p.pattern_match("r.kt", "rakt"));
        System.out.println(p.pattern_match("r.kt", "rzkt"));
        System.out.println(p.pattern_match("r..t", "rokt"));
        System.out.println(p.pattern_match("rokt.", "rokt"));
        System.out.println(p.pattern_match("...", "rokt"));
        System.out.println(p.pattern_match("", ""));
        System.out.println(p.pattern_match(".", ""));
        System.out.println(p.pattern_match("", "f"));

    }


}
