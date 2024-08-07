package rokt.rokt;

public class Pattern2 {
    /*
        pattern_match("rokt", "rokt") => True
        pattern_match("foo", "rokt") => False
        pattern_match("r1kt", "rokt") => True
        pattern_match("r2t", "rokt") => True
        pattern_match("1ok1", "rokt") => True
        pattern_match("rokt1", "rokt") => False
        pattern_match("rok2", "rokt")*/
    public boolean pattern_match(String pattern, String str) {
        try {
            boolean matching = true;
            for (int i = 0, j = 0; i < pattern.length(); ) {
                char c = pattern.charAt(i);
                char d = str.charAt(j);
                if (Character.isDigit(c)) {
                    i++;
                    j = j + Integer.parseInt(String.valueOf(c));
                    if (j > str.length()) {
                        matching = false;
                    }

                } else {
                    if (c != d) {
                        matching = false;
                        break;
                    }
                    i++;
                    j++;
                }
            }
            return matching;
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
    }

    public static void main(String args[]) {
        Pattern2 p = new Pattern2();


        System.out.println(p.pattern_match("foo", "rokt"));
        System.out.println(p.pattern_match("r1kt", "rokt"));
        System.out.println(p.pattern_match("r2t", "rokt"));
        System.out.println(p.pattern_match("1ok1", "rokt"));
        System.out.println(p.pattern_match("rokt1", "rokt"));
        System.out.println(p.pattern_match("rok1", "rokt"));
    }


}
