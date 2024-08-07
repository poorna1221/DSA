package amazon;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicates {
    static void tF(Integer arr[]) {
        System.out.println("--------------");
        Set<Integer> st = new LinkedHashSet<>();
        for (Integer i : arr) {
            if (st.add(i) == false) {
                System.out.println(i);
            }
        }
        System.out.println("---END");
        st.stream().forEach(e -> System.out.println(e));
    }

    public static void main(String[] args) {

        Integer[] arr = new Integer[]{1, 2, 3, 4, 2, 7, 8, 8, 3};
/*
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print("main" + arr[i]);
                }
            }
        }*/

        tF(arr);
    }
}
