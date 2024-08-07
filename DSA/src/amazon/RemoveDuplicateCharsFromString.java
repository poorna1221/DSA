package amazon;

import java.util.*;

public class RemoveDuplicateCharsFromString {
    static void removeDuplicateChars() {


        String str = "Poornaa";
        List<Character> ch = new ArrayList<>();
        for (char c : str.toCharArray()) {
            ch.add(c);
        }

        ch.stream().distinct().forEach(e -> System.out.println(e));

        //Arrays.stream(arr).distinct().forEach(e -> System.out.println(e));
    }

    static void removeDuplicateFromSortedArray() {
        int target = 2;
        int arr[] = {1, 1, 1, 1, 2, 2, 2};

        //Arrays.stream(arr).distinct().forEach(System.out::println);
        List<Integer> ls = new ArrayList<>();

        int i = 0;

        for (int j = 0; j < arr.length; j++) {
            arr[i++] = arr[j];
            ls.add(arr[j]);
            while (j != arr.length - 1 && arr[j] == arr[j + 1]) {
                j++;
            }

        }
        ls.stream().forEach(e -> System.out.println(e));
        System.out.println(Arrays.toString(ls.stream().mapToInt(a -> a).toArray()));
        //Arrays.stream(arr).forEach(e -> System.out.println(e));
    }

    static void removeTargetElement() {
        int target = 2;
        int j = 0;
        int arr[] = {2, 3, 1, 1, 4, 2};
        int newArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != target) {
                arr[j] = arr[i];
                j++;
            }
        }

        System.out.println(j);


    }

    public static void main(String[] args) {

        String str = "Poornaa";

        LinkedHashSet<Character> st = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            st.add(str.charAt(i));
        }

        for (char ch : st) {
            //System.out.println(ch);
        }


        int arr[] = {3, 2, 3, 6, 9, 5, 7, 100, 8};

        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            treeSet.add(arr[i]);
        }

        for (int ch : treeSet) {
            System.out.println(ch);
        }
        System.out.println("-------");
        removeDuplicateFromSortedArray();

    }
}
