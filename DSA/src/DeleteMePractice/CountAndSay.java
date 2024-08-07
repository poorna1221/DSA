package DeleteMePractice;

import java.util.HashMap;
import java.util.Map;

public class CountAndSay {
    static void countAndSay() {
        String number = "233344445";
        String inputArray[] = number.split("");
        Map<Integer, Integer> mp = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < inputArray.length; i++) {
            Integer x = Integer.parseInt(inputArray[i]);
            mp.put(x, mp.getOrDefault(x, 0) + 1);
        }

        mp.forEach((k, v) -> {
            // System.out.print(k + "" + v);
            sb.append(k).append(v);
        });
        System.out.println("" + sb.toString());
    }

    static void countAndSay2() {
        String number = "23335";
        int i = 0, count = 0;
        while (i < number.length()) {
            if (i == number.length() - 1) {
                System.out.println("Number is" + number.charAt(i) + " count is 1 ");
                i++;
            } else {
                if ((number.charAt(i) == number.charAt(i + 1)) && i < number.length()) {
                    i++;
                    count++;
                } else {

                    System.out.println("Number is" + number.charAt(i) + " count is" + (count + 1));
                    i++;
                    count = 0;


                }
            }
        }

    }

    public static void main(String[] args) {
        countAndSay();
        countAndSay2();

    }
}
