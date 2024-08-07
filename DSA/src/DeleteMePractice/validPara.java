package DeleteMePractice;

import java.util.Stack;

public class validPara {

    String openPAR = "({[";
    String closedPAR = ")}]";
    Stack<Character> st = new Stack<>();

    public void tF() {
        boolean mismatch = false;
        String str = "{[()]}";

        for (int i = 0; i < str.length(); i++) {

            if (isOpening(str.charAt(i))) {
                st.push(str.charAt(i));
            } else {

                if (!isMatch(str.charAt(i), st.pop())) {
                    mismatch = true;
                }
            }
        }

        if (mismatch) {
            System.out.println("Invalid");

        } else {
            System.out.println("Valid");
        }

    }

    public boolean isMatch(char close, char open) {
        if (openPAR.indexOf(open) == closedPAR.indexOf(close)) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isOpening(char c) {
        if (openPAR.indexOf(c) != -1) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        validPara vp = new validPara();
        vp.tF();

    }
}
