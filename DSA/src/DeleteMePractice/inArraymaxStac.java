package DeleteMePractice;

import java.util.Stack;

public class inArraymaxStac {
    static Stack<int[]> st = new Stack<>();
    static int popArra[];

    static void maxValue(int data) {

        if (st.isEmpty()) {
            st.push(new int[]{data, data});
        } else {
            int staPeekArray[] = st.peek();
            st.push(new int[]{data, Math.max(data, staPeekArray[1])});
        }

    }

    static void getPeek() {
        while (!st.isEmpty()) {
            int outputStack[] = st.pop();
            System.out.println("Top Element is " + outputStack[0] + " minimum elements is " + outputStack[1]);
        }
    }

    public static void main(String[] args) {

        maxValue(2);
        maxValue(1);
        maxValue(9);
        maxValue(7);
        maxValue(5);
        maxValue(4);
        getPeek();
    }
}
