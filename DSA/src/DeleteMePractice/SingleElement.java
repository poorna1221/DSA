package DeleteMePractice;

import java.util.ArrayList;
import java.util.List;

public class SingleElement {
    static void SingleElement() {

        int arr[] = {2, 1, 4, 1, 2, 4, 5};
        int sum = 0;
        for (int i : arr) {
            sum = sum ^ i;
        }
        System.out.println(sum);

    }

    static void SingleElement1() {

        int arr[] = {2, 1, 4, 1, 2, 4, 5};
        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (ls.contains(arr[i])) {
                ls.remove(new Integer(arr[i]));
            } else {
                ls.add(arr[i]);
            }
        }
        System.out.println(ls.get(0));
    }

    public static void main(String[] args) {
        SingleElement();
        SingleElement1();
    }
}
