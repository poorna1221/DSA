package amazon;

import java.util.*;

public class PlusoneToLastInteger {
    static void plusoneToLastInteger() {
        Stack<Integer> stack = new Stack<>();


        int arr[] = {1, 2, 3};
        int carry = 1;
        for (int i = arr.length - 1; i >= 0; i--) {

            int sum = arr[i] + carry;
            carry = sum > 9 ? 1 : 0;
            stack.add(sum % 10);
        }

        if (carry > 0)
            stack.add(1);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }

    public static void main(String[] args) {
        plusoneToLastInteger();

    }
}
