package amazon;

import java.util.Random;
import java.util.Stack;

//incomplete
public class GetMinStack {
    static Stack<Integer> st = new Stack<>();
    static Stack<Integer> maxStack = new Stack<>();
    static Stack<int[]> StackArray = new Stack<>();

    public void pushToStack(int data, int minorMax) {

        if (minorMax == 0)//0 get max value
        {
            int maxValue = data;
            while (!maxStack.isEmpty() && maxValue < maxStack.peek()) {
                maxValue = maxStack.peek();
            }
            st.push(data);
            if (!maxStack.contains(maxValue)) {
                maxStack.push(maxValue);
            }
        }
        if (minorMax == 1)//1 get minimum value
        {
            if (maxStack.isEmpty()) {
                maxStack.push(data);
            } else {

                if (data < maxStack.peek()) {
                    maxStack.push(data);
                }
            }
            st.push(data);
        }
    }

    static void pushToStack(int data) {
        int maxStackValue = data;
        if (!maxStack.isEmpty() && maxStackValue < maxStack.peek()) {
            maxStackValue = maxStack.peek();
        }
        st.push(data);
        if (!maxStack.contains(maxStackValue)) {
            maxStack.push(maxStackValue);
        }

    }

    static void pushToStack_MinMax(int data) {
        int maxStackValue = data;
        if (maxStack.isEmpty()) {
            maxStack.push(data);
        } else {
            int minValue = Math.min(data, maxStack.peek());
            if (!maxStack.contains(minValue)) {
                maxStack.push(minValue);
            }

        }

    }


    static void pushToStackArray(int data) {

        if (StackArray.isEmpty()) {

            StackArray.push(new int[]{data, data});
        } else {
            int[] minimumElement = StackArray.peek();
            int minElement = Math.min(data, minimumElement[1]);
            StackArray.push(new int[]{data, minElement});

        }
    }

    public static void main(String[] args) {

        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int randomNo = rand.nextInt(100);
            System.out.println(randomNo);
            pushToStackArray(randomNo);
        }
        System.out.println("---------End of randoms");

        while (!StackArray.isEmpty()) {
            int outputStack[] = StackArray.pop();
            System.out.println("Top Element is " + outputStack[0] + " minimum elements is " + outputStack[1]);
        }

        while (!maxStack.isEmpty()) {
            System.out.println(maxStack.pop());
        }
    }
}
