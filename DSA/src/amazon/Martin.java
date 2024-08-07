package amazon;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import javafx.util.Pair;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Martin {
    static void twoArrayOfCharacters() {
        int k = 2;//charcters repatd with twice
        char arr1[] = {'p', 'x', 'o'};
        char arr2[] = {'i', 'c', 'o'};

        //IntStream.range(0, arr1.length).mapToObj(a -> a).toArray(Character[]::new);//boxed
        Map<Character, Integer> mp = new HashMap<>();

        for (char c : arr1) {

            mp.put(c, mp.getOrDefault(c, 0) + 1);

        }
        for (char c : arr2) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        mp.forEach((c, i) -> {
            if (i == k) {
                System.out.println("Character " + c);
            }

        });

    }

    static void twoArrayOfCharacters2() {
        int k = 2;//charcters repatd with twice
        Character arr1[] = {'p', 'x', 'o'};
        Character arr2[] = {'i', 'x', 'o'};
        Map<Character, Integer> mp = new HashMap<>();
        List<Character> ls = new ArrayList<>();

        Arrays.asList(arr1).stream().forEach(e -> {
            mp.put(e, mp.getOrDefault(e, 0) + 1);
        });
        Arrays.asList(arr2).stream().forEach(e -> {
            mp.put(e, mp.getOrDefault(e, 0) + 1);
        });

        mp.forEach((c, i) -> {
            if (i == k) {
                System.out.println("Character " + c);
            }

        });

    }

    static void secondMostFreqChar() {
        Character arr1[] = {'p', 'x', 'o', 'x', 'x', 'p', 'p', 'p'};

        Map<Character, Integer> mp = new HashMap<>();


        Arrays.stream(arr1).forEach(e -> {
            mp.put(e, mp.getOrDefault(e, 0) + 1);
        });

        PriorityQueue<pair> pq = new PriorityQueue<>((p1, p2) -> (p1.frequency - p2.frequency));


        mp.forEach((elemnet, frequency) -> {

            pq.offer(new pair(elemnet, frequency));
            if (pq.size() > 2) {
                pq.poll();
            }
        });

        List<Character> ls = pq.stream().map(pair -> pair.element).collect(Collectors.toList());

        Object arr[] = ls.stream().map(a -> a).toArray();
        System.out.println(arr[1]);

    }

    static void negativeOfInteger() {
        Integer x = -2147483648;
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;

        if (x > minValue) {
            System.out.println("Reverse of " + x + " is " + (-x));
        }


        // System.out.println(maxValue + " min value is" + minValue);

        if (x >= minValue && x <= maxValue)
            System.out.println("x is with in the int limit");
        else
            System.out.println("x is crossing the int limit");
    }

    static void verifyIfRearrnagingStringCharacsCanFormPalindrome() {

        String str = "geeksogeeks";
        List<Character> ls = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {

            if (ls.contains(str.charAt(i))) {
                ls.remove((Character) str.charAt(i));
            } else {
                ls.add(str.charAt(i));
            }
        }
        if (str.length() % 2 == 0 && ls.isEmpty() || (str.length() % 2 == 1 && ls.size() == 1)) {
            System.out.println("palindrome can be formed");
        } else {
            System.out.println("palindrome cannot  be formed");
        }


    }

    static void moveZerosToleft() {
        int arr[] = {2, 4, 0, 5, 0, 1, 0, 7};
        int arr1[] = new int[8];
        int k = 0;
/*        Integer arr1[] = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        List<Integer> ls = Arrays.asList(arr1).stream().sorted().collect(Collectors.toList());
        ls.forEach(e -> System.out.println(e));*/
       /* Integer arr1[] = {2, 4, 0, 5, 0, 1, 0, 7};
        Arrays.asList(arr1).stream().sorted().forEach(e -> System.out.println(e));*/
        for (int i : arr) {
            if (i == 0) {
                k++;
            }
        }
        for (int i = 0; i < k; i++) {
            arr1[i] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr1[k] = arr[i];
                k++;
            }

        }

        for (int i : arr1) {
            System.out.println(i);
        }

    }

    static void moveZerosToleft_2() {
        int arr[] = {2, 4, 0, 5, 0, 1, 0, 7};
      

        int endIndex = arr.length - 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[endIndex] = arr[i];
                endIndex--;
            }
        }

        for (int i = endIndex; i >= 0; i--) {
            arr[i] = 0;
        }

        for (int i : arr) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        //twoArrayOfCharacters2();
        //secondMostFreqChar();
        //reverseInteger();
        //verifyIfRearrnagingStringCharacsCanFormPalindrome();
        moveZerosToleft_2();
    }
}

class pair {
    public Character element;
    public Integer frequency;

    pair(Character element, Integer frequency) {
        this.element = element;
        this.frequency = frequency;
    }
}