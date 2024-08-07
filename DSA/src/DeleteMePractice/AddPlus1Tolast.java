package DeleteMePractice;// Java program to implement a stack that supports
// getMaximum() in O(1) time and O(1) extra space.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class AddPlus1Tolast {
    static void addPlus1Tolast() {
        int a[] = {9, 9, 9};
        Stack<Integer> st = new Stack<>();
        int carry = 1;
        int sum = 0;
        int add = 1;
        for (int i = a.length - 1; i >= 0; i--) {
            sum = a[i] + add;
            //carry = sum > 9 ? 1 : 0;
            if (sum > 9) {
                st.add(0);
                add = 1;
            } else {
                st.add(sum);
                add = 0;
            }
        }
        if (add > 0) {
            st.add(1);
        }
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }

    }

    static void addPlus1Tolast_2() {
        Stack<Integer> st = new Stack<>();

        int arr[] = {9, 9, 9};
        int sum = 0;
        int carry = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            sum = arr[i] + carry;

            carry = (sum > 9) ? 1 : 0;
            st.add(sum % 10);

        }
        if (carry > 0)
            st.add(1);
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }

    static void test() {
        List<Integer> st = new LinkedList<>();
        int arr[] = {9, 9, 9};
        int addValue = 1;
        int sum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            sum = arr[i] + addValue;

            if (sum > 9) {
                st.add(0, 0);
                addValue = 1;
            } else {
                st.add(0, sum);
                addValue = 0;
            }
        }
        if (addValue == 1) {
            st.add(0, 1);
        }

        for (int i : st) {
            System.out.print(i);
        }

    }

    public static void main(String[] args) {
        test();
    }
}
