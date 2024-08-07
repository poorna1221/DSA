package DeleteMePractice;

import java.util.*;
import java.util.stream.Collectors;

public class Martin {
    static void charsRepeated() {

        char arr1[] = {'p', 'i', 'o'};
        char arr2[] = {'i', 'c', 'o'};

        Map<Character, Integer> mp = new HashMap<>();
        for (char c : arr1) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        for (char x : arr2) {
            mp.put(x, mp.getOrDefault(x, 0) + 1);
        }

        mp.forEach((k, v) -> {

            if (v == 2) {
                System.out.println("" + k);
            }
        });


    }

    static void secondMostFreqChar() {
        Character arr1[] = {'p', 'x', 'o', 'x', 'x', 'p', 'p', 'p'};
        Map<Character, Integer> mp = new HashMap<>();
        Arrays.asList(arr1).stream().forEach(e -> {
            mp.put(e, mp.getOrDefault(e, 0) + 1);
        });
        int x = 2;

        Queue<Pair> q = new PriorityQueue<Pair>((a, b) -> a.frequency - b.frequency);

        mp.forEach((k, v) -> {

            q.add(new Pair(k, v));
            if (q.size() > 2) {
                q.poll();
            }
        });


        List<Character> ch = q.stream().map(pair -> pair.element).collect(Collectors.toList());
        Object obj[] = ch.stream().map(a -> a).toArray();
        System.out.println(obj[obj.length - 2]);
    }

    static void negative() {
        int maxiumValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
        int x = 5;
        if (x > minValue && x < maxiumValue)
            System.out.println("" + "With in range" + "  negative no is" + (-x));

    }

    static void verifyIfRearrnagingStringCharacsCanFormPalindrome() {

        String str = "geeksogeeks";


    }

    public static void main(String[] args) {

        negative();
    }

    static class Pair {
        Character element;
        Integer frequency;

        Pair(Character element, int frequency) {
            this.element = element;
            this.frequency = frequency;
        }
    }
}
