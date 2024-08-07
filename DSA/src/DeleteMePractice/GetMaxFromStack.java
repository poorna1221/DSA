package DeleteMePractice;// Java program to implement a stack that supports
// getMaximum() in O(1) time and O(1) extra space.


import java.util.Iterator;
import java.util.Stack;

class
GetMaxFromStack {

    static Stack<Integer> st = new Stack<>();
    static Stack<Integer> maxSt = new Stack<>();

    static void getmaxStack() {
        Stack<Integer> s1 = new Stack<>();
        //Stack<Integer> s2 = new Stack<>();

        int arr[] = {8, 2, 9, 3, 98, 15, 45, 1, 2, 3};
        int currentMax = arr[0];


        s1.push(arr[0]);
        //s2.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {


            if (arr[i] > currentMax) {
                s1.pop();
                s1.push(arr[i]);
                currentMax = arr[i];

            }


        }
        System.out.println("Max element is" + s1.pop());

    }

    void pushToStack(int data) {
        int max = data;

    /*    if (!GetMaxFromStack.maxSt.isEmpty() && max < GetMaxFromStack.maxSt.peek()) {
            max = GetMaxFromStack.maxSt.peek();

        } //one approach where we need not store first element to push.
        GetMaxFromStack.st.push(data);
        GetMaxFromStack.maxSt.push(max);*/

        if (max > GetMaxFromStack.maxSt.peek()) {
            GetMaxFromStack.maxSt.push(max);

        }//with this approach if we don't push first element to stack peek element will be empty and error is thrown.
        GetMaxFromStack.st.push(data);

    }

    public void getMaxElement() {
        System.out.println("max element is " + GetMaxFromStack.maxSt.peek());
    }

    public static void main(String[] args) {
        //getmaxStack();
        GetMaxFromStack obj = new GetMaxFromStack();
        GetMaxFromStack.maxSt.push(18);
        obj.pushToStack(18);


        obj.pushToStack(2);
        obj.pushToStack(29);
        obj.pushToStack(23);
        obj.pushToStack(94);
        obj.getMaxElement();

        Iterator iter = st.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }

}
 