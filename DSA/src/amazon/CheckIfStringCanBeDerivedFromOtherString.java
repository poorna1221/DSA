package amazon;

public class CheckIfStringCanBeDerivedFromOtherString {
    /*

        X = ABCD
                Y = DABC

        Output: Yes

        Y can be derived from X by right-rotating it by 1 unit*/
    static void tF() {

        String x = "ABCD";
        String y = "DABC";
        System.out.println(x + x);
        if ((x + x).contains(y)) {
            System.out.println("Y is found in x");
        } else {
            System.out.println("Y is not found in x");
        }

    }

    static void strinDerivedFromEachOther() {
        String X = "ABCD";
        String Y = "DABC";

        if (X == null || Y == null) {
            System.out.println("Given strings cannot be derived from each other");
        }

        // if string lengths are different, they can't be
        // derived from each other
        if (X.length() != Y.length()) {
            System.out.println("Given strings cannot be derived from each other");
        }

        // Invariant: At the i'th iteration of this loop,
        // the string `X` will be rotated by `i` units
        for (int i = 0; i < X.length(); i++) {

            X = X.substring(1) + X.charAt(0);
            //System.out.println("sub string is" + X.substring(1) + "char is " + X.charAt(0));
            if (X.equalsIgnoreCase(Y)) {
                System.out.println("Given strings can be derived from each other");
            }
        }

        // return false if no rotation is matched
        System.out.println("Given strings cannot be derived from each other");
    }

    public static void main(String[] args) {
        //tF();
        strinDerivedFromEachOther();
    }
}
