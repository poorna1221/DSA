package DeleteMePractice;

import java.util.*;

public class KLargestEleements {
    static void kLargestEleements() {
        int k = 2;
        int arr[] = {1, 9, 5, 4, 3, 2};
        Integer arr1[] = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.stream(arr1).sorted(Collections.reverseOrder()).limit(k).forEach(System.out::println);
    }

    static void kLargestEleements_PQ() {
        int k = 2;
        int arr[] = {1, 9, 5, 4, 3, 2};
        List<Integer> ls = new ArrayList<>();
        Arrays.stream(arr).forEach(e -> {
            ls.add(e);
        });
        Queue<Integer> que = new PriorityQueue<Integer>((a, b) -> (a - b));
        que.addAll(ls);

        Iterator<Integer> it = que.iterator();
        while (it.hasNext()) {
            System.out.println(que.poll());
        }


    /*    while (que.size() > k) {
            que.poll();
        }
        System.out.println(que.poll());
        System.out.println(que.poll());*/

    }

    static void arrayLargest() {
        int arr[] = {1, 8, 88, 55, 67, 99, 102, 145, 4, 7, 100};
        Integer arr1[] = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arr);
        System.out.println("" + arr[arr.length - 1]);

    }

    public static void main(String[] args) {
        //kLargestEleements();
        //kLargestEleements_PQ();
        arrayLargest();

    }
}
