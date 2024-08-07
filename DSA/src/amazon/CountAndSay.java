package amazon;

import java.util.HashMap;
import java.util.Map;

public class CountAndSay {
    static void tF() {
        String number = "233344445";
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> mp = new HashMap<>();
        for (String s : number.split("")) {
            mp.put(Integer.parseInt(s), mp.getOrDefault(Integer.parseInt(s), 0) + 1);
        }
        mp.forEach((k, v) -> {
            sb.append(k).append(v);

        });
        System.out.println(sb.toString());
    }


    static void countAndSay_YT() {
        String number = "233344445";
        StringBuilder sb = new StringBuilder();

        int count = 0;
        for (int i = 0; i < number.length(); i++) {
            count++;
            if (i == number.length() - 1 || number.charAt(i) != number.charAt(i + 1)) {
                sb.append(number.charAt(i)).append(count);
                count = 0;

            }

        }
        System.out.println("" + sb.toString());
    }

    public static void main(String[] args) {

        countAndSay_YT();
        //countAndSay_YT2();
        //System.out.println(sb.toString());
    }
}
