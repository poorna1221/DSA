package DeleteMePractice;

public class CheckIfStringCanbeDerived {
    static void checkIfStringCanbeDerived() {
        String x = "ABCD";
        String y = "DABC";
        boolean found = false;
        for (int i = 0; i < x.length(); i++) {
            x = x.substring(1, x.length()) + x.charAt(0);
            System.out.println("" + x);
            if (x.equals(y)) {
                found = true;
            }
        }


        if (found) System.out.println("FOUND");
        else System.out.println("NOT FOUND");
    }

    public static void main(String[] args) {
        checkIfStringCanbeDerived();

    }
}
