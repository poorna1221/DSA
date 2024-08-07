package amazon;

import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 2, 2, 3, 4, 3, 3, 3, 5};
        Map<Integer, Integer> mp = new HashMap<>();
        Arrays.stream(arr).forEach(e -> {
            mp.put(e, mp.getOrDefault(e, 0) + 1);
        });

        mp.forEach((e, f) -> {
            // System.out.println(e + " count is  " + f);

        });

        PriorityQueue<TestPQ> pq = new PriorityQueue<>((p1, p2) -> {
            return p1.frequency - p2.frequency;
        });

        mp.forEach((e, f) -> {

            pq.offer(new TestPQ(e, f));
            if (pq.size() > 2) {
                pq.poll();
            }
        });

        List<Integer> ls = pq.stream().map(e -> e.element).collect(Collectors.toList());
        System.out.println(Arrays.toString(ls.stream().mapToInt(a -> a).toArray()));

       /* TestPQ p1 = pq.poll();
        System.out.println("" + p1.element + " " + p1.frequency);
        TestPQ p2 = pq.poll();
        System.out.println("" + p2.element + " " + p2.frequency);*/
    }
}

class TestPQ {
    public Integer element;
    public Integer frequency;

    TestPQ(Integer element, Integer frequency) {
        this.element = element;
        this.frequency = frequency;
    }
}
