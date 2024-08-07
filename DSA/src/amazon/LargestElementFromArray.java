package amazon;

import java.util.*;
import java.util.stream.Collectors;

public class LargestElementFromArray {

    static void arrayLargest() {
        int arr[] = {1, 8, 88, 55, 67, 99, 102, 145, 4, 7, 100};

        Arrays.sort(arr);

        for (int a : arr) {
            System.out.println(a);
        }

        System.out.println(arr[arr.length - 1]);

    }

    static void kthLargestElement() {
        int arr[] = {1, 8, 88, 55, 67, 99, 102, 145, 4, 7, 100};
        int k = 4;

        List<Integer> list = new ArrayList<>();

        list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        Queue<Integer> qI = new PriorityQueue<>(Comparator.naturalOrder());

        qI.addAll(list);

       /* while (--k > 0) {
            qI.poll();
        }*/
        while (qI.size() > 4) {
            qI.poll();
        }
        System.out.println(qI.peek());

    }

    public static void main(String[] args) {
        //arrayLargest();
        kthLargestElement();

    }
}