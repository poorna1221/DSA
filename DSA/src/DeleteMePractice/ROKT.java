package DeleteMePractice;

public class ROKT {
    static void tF() {
        String s1 = "RO*T", s2 = "ROKT";
        boolean mismatch = false;
        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) == '*')
                continue;
            if (s1.charAt(i) != s2.charAt(i)) {
                mismatch = true;
            }
        }

        if (mismatch) System.out.println("strings are not same");
        else System.out.println("Strings are same");
    }

    static void tF3() {
        String s1 = "RO*T", s2 = "ROKT";

        StringBuilder sb1 = new StringBuilder(s1);

        StringBuilder sb2 = new StringBuilder(s2);

        int starPosition = -1;
        for (char c : s1.toCharArray()) {
            if (c == '*') {
                starPosition = s1.indexOf(c);
                System.out.println("" + starPosition);
            }
        }
        System.out.println("" + sb1.deleteCharAt(starPosition));
        System.out.println("" + sb2.deleteCharAt(starPosition));


        if (String.valueOf(sb1.deleteCharAt(starPosition)).equals(String.valueOf(sb2.deleteCharAt(starPosition)))) {
            System.out.println("same");
        }
    }


    public static void main(String[] args) {

    }
}
