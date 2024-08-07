package amazon;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KLargestElements {
    static void convertListToArray() {
        int k = 2;
        int arr[] = {1, 9, 5, 4, 3, 2};
        int answerArray[] = new int[k];
        //Integer newArray[] = new Integer[arr.length];
        List<Integer> ls = Arrays.stream(arr).boxed().collect(Collectors.toList());


        ls = ls.stream().sorted(Collections.reverseOrder()).limit(k).collect(Collectors.toList());

        int[] ar = ls.stream().mapToInt(a -> a).toArray();
        for (int i : ar) {
            System.out.println(i);
        }

    }

    static void kLarge() {
        int arr[] = {1, 4, 3, 2, 8, 9, 44, 6, 8};

        Integer arrArr[] = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        List<Integer> ls = Arrays.asList(arrArr).stream().sorted(Collections.reverseOrder()).limit(2).collect(Collectors.toList());

        int a[] = ls.stream().mapToInt(c -> c).toArray();
        System.out.println(Arrays.toString(ls.stream().toArray()));
    }

    public static void main(String[] args) {
       /* int arr[] = {1, 9, 5, 4, 3, 2};
        Integer newArray[] = new Integer[arr.length];
        List<Integer> ls = Arrays.stream(arr).boxed().collect(Collectors.toList());

        ls.stream().sorted(Collections.reverseOrder()).limit(3).forEach(e -> System.out.println(e));
      *//*  Integer intArr[] = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        Arrays.asList(intArr).stream().distinct().sorted(Comparator.reverseOrder()).limit(2).forEach(e -> System.out.println(e));*//*
        //List<Integer> ls = Arrays.asList(arr);*/
        kLarge();
    }
}
