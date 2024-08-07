package amazon;


public class ROKT {

    static boolean isNumberic(char c) {

        return Character.isDigit(c);
    }

    public static boolean patternMatch(String string, String pattern) {
        boolean mismatch = false;

        int i = 0;
        int j = 0;
        while (i < pattern.length()) {
            char c = pattern.charAt(i);
            char d = string.charAt(j);
            if (isNumberic(c)) {
                i++;
                j = j + Integer.parseInt(String.valueOf(c));
            } else {
                i++;
                j++;
                if (c != d) {
                    mismatch = true;
                    break;
                }
            }

        }


        if (mismatch) {
            return false;
        } else {
            return true;
        }

    }

    public static void main(String[] args) {

        //System.out.println(patternMatch("ROKTT", "R3T"));
        System.out.println(patternMatch("internationalization", "i18n"));
    }

}
