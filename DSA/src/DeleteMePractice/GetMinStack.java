package DeleteMePractice;

import java.util.Random;
import java.util.Stack;

//incomplete
public class GetMinStack {
    static Stack<int[]> stack = new Stack<>();

    public void pushToStack(int data) {


        if (stack.isEmpty()) {
            int[] dataStack = {data, data};
            stack.push(dataStack);
        } else {
            int minValue = Math.min(data, stack.peek()[1]);

            stack.push(new int[]{data, minValue});
        }


    }


    public static void main(String[] args) {
        GetMinStack gms = new GetMinStack();


        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int no = rand.nextInt(100);
            System.out.println(no);
            gms.pushToStack(no);
        }

        while (!stack.isEmpty()) {
            int test[] = stack.pop();
            System.out.println(test[0] + "is" + test[1]);
        }

    }
}
