package rokt.rokt;

public class Pattern3 {

    public boolean pattern_match(String pattern, String str) {
        boolean matchingStrings = true;
        StringBuilder sb = new StringBuilder();
        for (int i = 0, j = 0; i < pattern.length(); ) {

            char c = pattern.charAt(i);
            char d = str.charAt(j);
            if (Character.isDigit(c)) {
                while (i < pattern.length() && Character.isDigit(pattern.charAt(i))) {
                    sb.append(pattern.charAt(i));
                    i++;
                }
                j = j + Integer.parseInt(sb.toString());
                /*int len = sb.toString().length();
                sb.delete(0, len + 1);*/
                sb.setLength(0);
            } else {
                i++;
                j++;
                if (c != d) {
                    matchingStrings = false;
                    break;
                }
            }
        }
        return matchingStrings;

    }

    public static void main(String args[]) {
        Pattern3 p = new Pattern3();
        System.out.println(p.pattern_match("i18n", "internationalization"));
        System.out.println(p.pattern_match("f10z8xx", "fxxxxxxxxxxzxxxxxxxxxx"));

    }


}
