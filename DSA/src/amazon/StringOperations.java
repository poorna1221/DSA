package amazon;

public class StringOperations {
    static void compareTwoStrings() {

        String s1 = "R*T", s2 = "ROKT";
        char s1CurrentChar, s2CurrentChar;

     
    }

    static void compareTwoStrings2() {

        String s1 = "R*T", s2 = "ROKT";
        boolean stringMatch = true;
        for (int i = 0; i < s2.length(); i++) {

            if (s2.charAt(i) != '*') {
                if (s1.charAt(i) != s2.charAt(i)) {
                    stringMatch = false;
                    break;
                }

            }

        }
        if (stringMatch) {
            System.out.println("strings are matching");
        }

    }


    public static void main(String[] args) {
        compareTwoStrings2();

    }
}
