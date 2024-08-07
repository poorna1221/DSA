package DeleteMePractice;

import java.util.*;
import java.util.stream.Collectors;

public class MostFre {
    static class Pair {

        Character c;
        Integer i;

        Pair(Character c, Integer i) {
            this.c = c;
            this.i = i;
        }
    }

    public static void main(String[] args) {
        Map<Character, Integer> mp = new HashMap<Character, Integer>();
        Character arr1[] = {'p', 'x', 'o', 'x', 'x', 'p', 'p', 'p'};
        Arrays.asList(arr1).stream().forEach(e -> {
            mp.put(e, mp.getOrDefault(e, 0) + 1);
        });


        PriorityQueue<Pair> pq = new PriorityQueue<>((o1, o2) -> (o1.i - o2.i));

        mp.forEach((k, v) -> {
            pq.offer(new Pair(k, v));
        });

        if (pq.size() > 2) {
            pq.poll();
        }

      /*  Pair ele = pq.poll();
        System.out.println(ele.c);*/

        List<Character> lsc = pq.stream().map(e -> e.c).collect(Collectors.toList());
        Object[] c = lsc.stream().map(a -> a).toArray();

        for (Object o : c) {
            System.out.println(o);
        }

    }
}
