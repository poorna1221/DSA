package amazon;

import java.util.Stack;

public class ValidParanthesis {

    private static final String OPENING_CHARS = "([{";
    private static final String CLOSING_CHARS = ")]}";

    static boolean isOpening(char c) {
        if (OPENING_CHARS.indexOf(c) != -1) {
            return true;
        } else return false;

    }

    static boolean isMatching(char opening, char closing) {

        if (OPENING_CHARS.indexOf(opening) == CLOSING_CHARS.indexOf(closing))
            return true;
        else return false;
    }

    public static boolean isValid() {
        String str = "[";
        boolean matching = true;
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < str.length(); i++) {

            if (isOpening(str.charAt(i))) {
                stk.push(str.charAt(i));
            } else {

                if (stk.isEmpty() || !isMatching(stk.pop(), str.charAt(i))) {
                    return false;
                }

            }
        }
        return stk.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid());

    }
}