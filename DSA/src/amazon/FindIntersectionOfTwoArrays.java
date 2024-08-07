package amazon;

import java.util.*;

public class FindIntersectionOfTwoArrays {
    static void findIntersectionOfTwoArrays() {

        int firstArray[] = {1, 2, 3, 2, 5, 7};
        int secondArray[] = {1, 6, 3, 2, 2, 4, 9};

        List<Integer> st = new ArrayList<>();
        List<Integer> ansSet = new ArrayList<>();

        for (int i : firstArray) {
            st.add(i);
        }
        for (int j : secondArray) {
            if (st.contains(j)) {
                ansSet.add(j);
            }
        }
        System.out.println(Arrays.toString(ansSet.stream().mapToInt(a -> a).toArray()));
    }

    public static void main(String[] args) {
        findIntersectionOfTwoArrays();

    }
}
