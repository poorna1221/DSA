package amazon;// Java program to implement a stack that supports
// getMaximum() in O(1) time and O(1) extra space.


import java.util.Iterator;
import java.util.Stack;

class GetMaxFromStack_2 {

    Stack<Integer> st = new Stack<>();


    Stack<Integer> maxStack = new Stack<>();

    /*public void pushToStack(int data, int minorMax) {

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


    }*/

    public void sortStack(int data) {

        if (maxStack.isEmpty()) {
            maxStack.push(data);
        } else {

            if (data < maxStack.peek()) {
                int prevEle = maxStack.pop();
                maxStack.push(data);
                maxStack.push(prevEle);

            }
        }

    }

    public int getMaxValue() {
        return maxStack.peek();
    }

    public int getMaxValueAndRemove() {
        return maxStack.pop();
    }

    public void pushToStack(int data, int minmax) {
        if (maxStack.isEmpty()) {
            maxStack.push(data);
        } else {
            maxStack.push(Math.max(data, maxStack.peek()));
        }


    }

    public static void main(String[] args) {
        GetMaxFromStack_2 obj = new GetMaxFromStack_2();
        int minMax = 1;
        obj.pushToStack(8, minMax);
        obj.pushToStack(2, minMax);
        obj.pushToStack(9, minMax);
        obj.pushToStack(3, minMax);
        obj.pushToStack(6, minMax);
        //obj.pushToStack(1, minMax);
        obj.pushToStack(4, minMax);

        System.out.println(obj.getMaxValue());
    }

}
 