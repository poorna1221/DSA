package DeleteMePractice;

import java.util.Stack;

public class GetMaxStack {

    static Stack<Integer> st = new Stack<Integer>();
    static Stack<Integer> maxStack = new Stack<Integer>();
    static Stack<int[]> stArray = new Stack<int[]>();
/*
    public void pushToStack(int n) {
        int maxvalue = n;

        if (!maxStack.isEmpty() && maxStack.peek() < maxvalue)
            maxvalue = maxStack.peek();

        st.push(n);
        if (!maxStack.contains(maxvalue))
            maxStack.push(maxvalue);

    }*/

    public void pushToStack(int n) {

        if (maxStack.isEmpty()) {
            maxStack.push(n);
        } else {
            maxStack.push(Math.min(n, maxStack.peek()));
        }

    }

    /*public void pushToStack(int n) {

        int temp[] = {};
        if (stArray.isEmpty()) {
            stArray.push(new int[]{n, n});


        } else {
            int[] peekValue = stArray.peek();
            int maxValue = Math.min(n, peekValue[1]);

            stArray.push(new int[]{n, maxValue});

        }


    }*/

    public static void main(String[] args) {
        GetMaxStack gms = new GetMaxStack();

        gms.pushToStack(6);
        gms.pushToStack(9);
        gms.pushToStack(4);
        gms.pushToStack(1);
        gms.pushToStack(2);
        gms.pushToStack(3);

        while (!maxStack.isEmpty()) {

            System.out.println(maxStack.pop());
        }

    }
}
