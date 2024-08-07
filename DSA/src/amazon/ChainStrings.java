package amazon;

import java.util.HashMap;
import java.util.Map;

public class ChainStrings {
    static void tF() {

        String arr[] = {"aaa", "bbb", "baa", "aab"};
        Map<String, Boolean> mp = new HashMap<String, Boolean>();
        StringBuilder sb = new StringBuilder();
        boolean circleFormed = false;
        int count = arr.length;
        String firstString = arr[0];
        sb.append(firstString);


        for (int i = 1; i < arr.length; i++) {
            mp.put(arr[i], false);
        }

        mp.put(firstString, true);
        for (int i = 1; i < arr.length; i++) {
            if (firstString.charAt(firstString.length() - 1) == arr[i].charAt(0)) {
                sb.append(arr[i]);
                mp.put(arr[i], true);
            }
        }

        mp.forEach((k, v) -> {
            if (v == false) {
                if (sb.toString().charAt(sb.toString().length() - 1) == k.charAt(0)) {
                    sb.append(k);
                    mp.put(k, true);
                }
            }
        });
        System.out.println(sb.toString());

        mp.forEach((k, v) -> {
            System.out.println("" + k + "" + v);

        });
    }

    public static void main(String[] args) {

        tF();
    }
}
