package DeleteMePractice;

import java.util.ArrayList;
import java.util.List;

public class FirstAndLastIndex {
    static void tF(int n) {

        int arr[] = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        List<Integer> ls = new ArrayList<>();
        for (int i : arr) {
            ls.add(i);
        }

        System.out.println("" + ls.indexOf(n));
        System.out.println("" + ls.lastIndexOf(n));
    }

    static void tF_2(int target) {

        int arr[] = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int firstIndex = -1;
        int lastIndex = -1;

        int i = 0;
        while (i < arr.length) {

            if (arr[i] == target) {
                if (firstIndex == -1) {
                    firstIndex = i;
                } else {
                    lastIndex = i;
                }
            }
            i++;

        }
        System.out.println("firstIndex" + firstIndex);
        System.out.println("lastIndex" + lastIndex);
    }

    public static void main(String[] args) {

        int n = 2;
        tF(n);
        tF_2(n);
    }
}
