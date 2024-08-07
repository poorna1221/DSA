package DeleteMePractice;

import sun.security.util.ArrayUtil;

import java.util.*;
import java.util.stream.Collectors;

public class AddDigits {
    static Map<Character, Integer> mp = new HashMap<>();
    static PriorityQueue<pair> pq = new PriorityQueue<>((p1, p2) -> p1.i - p2.i);

    static void secondMostFreqChar() {
        int arr[] = {2, 4, 0, 5, 0, 1, 0, 7};
        int endIndex = arr.length - 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[endIndex] = arr[i];
                endIndex--;
            }
        }

        for (int j = endIndex; j >= 0; j--) {
            arr[j] = 0;
        }

        /*for (int x : arr)
            System.out.println(x);

        */


    }

    public static void main(String[] args) {
        secondMostFreqChar();

    }

    static class pair {
        Character c;
        Integer i;

        pair(Character c, Integer i) {
            this.c = c;
            this.i = i;
        }

    }
}