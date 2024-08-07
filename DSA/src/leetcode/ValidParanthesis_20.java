package leetcode;

import java.util.Stack;

public class ValidParanthesis_20 {
    public String opening_char = "[{(";
    public String closing_char = "]})";

    public boolean isValid(String s) {

        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if (opening_char.indexOf(c) != -1) {
                st.push(c);
            } else {
                char currentClosingChar = s.charAt(i);
                if (st.isEmpty() || closing_char.indexOf(currentClosingChar) != opening_char.indexOf(st.pop())) {
                    return false;
                }

            }

        }

        if (st.isEmpty()) return true;
        else return false;
    }

    public static void main(String[] args) {
        ValidParanthesis_20 s = new ValidParanthesis_20();
        String str = "[";
        System.out.println(s.isValid(str));

    }
}
