package DeleteMePractice;

import java.util.*;
import java.util.stream.Collectors;

public class kthlargestElement {
    static void arrayLargest() {
        Integer arr[] = {1, 8, 88, 55, 67, 99, 102, 145, 4, 7, 100};
        int k = 5;
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(arr[k - 1]);
    }

    static void arrayLargest2() {
        Integer arr[] = {1, 8, 88, 55, 67, 99, 102, 145, 4, 7, 100};
        int k = 5;
        Arrays.sort(arr, Collections.reverseOrder());
        List<Integer> ls = new ArrayList<Integer>();
        ls = Arrays.stream(arr).collect(Collectors.toList());

        Queue<Integer> qa = new PriorityQueue<Integer>((a, b) -> (a - b));
        qa.addAll(ls);
        while (qa.size() > k) {
            qa.poll();
        }
        System.out.println(qa.peek());
    }

    public static void main(String[] args) {

        arrayLargest();
        arrayLargest2();
    }
}
