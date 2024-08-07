package DeleteMePractice;

import java.util.Stack;

public class ValidParanthesis {
    static String openParan = "({[";
    static String closedParan = ")}]";

    static void ValidParanthesis() {
        boolean mismatch = false;
        String paran = "({[}])";

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < paran.length(); i++) {

            if (isOpening(paran.charAt(i))) {
                stack.push(paran.charAt(i));
            } else {
                if (!isMatching(stack.pop(), paran.charAt(i))) {
                    mismatch = true;
                }
            }

        }
        if (mismatch)
            System.out.println("not a valid paranthesis");
        else
            System.out.println("valid paranthesis");
    }

    static boolean isOpening(char c) {
        if (openParan.indexOf(c) != -1) {
            return true;
        } else return false;
    }

    static boolean isMatching(char opening, char closing) {
        if (openParan.indexOf(opening) == closedParan.indexOf(closing)) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        ValidParanthesis();
    }
}
