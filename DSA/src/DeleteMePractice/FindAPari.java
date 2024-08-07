package DeleteMePractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAPari {
    static void findAPari() {
        int arr[] = {1, 6, 3, 4, 2, 9};
        int target = 10;
        List<Integer> ls = new ArrayList<>();
        for (int i : arr) {
            if (ls.contains(target - i)) {
                System.out.println("Pairs are " + i + "index is" + ls.indexOf(i) + " and " + (target - i) + " index is" + ls.indexOf(target - i));
            } else {
                ls.add(i);
            }
        }
    }

    static void findAPair_Map() {
        int arr[] = {1, 6, 3, 4, 2, 9};
        int target = 10;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i : arr) {
            if (mp.containsKey(target - i)) {
                System.out.println("MAP are " + i + " and " + (target - i));
            } else {
                mp.put(i, i);
            }
        }
    }

    public static void main(String[] args) {
        findAPari();
        findAPair_Map();

    }
}
