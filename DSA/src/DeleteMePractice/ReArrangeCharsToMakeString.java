package DeleteMePractice;

import java.util.HashMap;
import java.util.Map;

public class ReArrangeCharsToMakeString {
    static void tF(String source, String target) {
        Map<Character, Integer> mp = new HashMap<>();
        int minChars = Integer.MAX_VALUE;

        for (char c : source.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        for (char x : target.toCharArray()) {

            int count = mp.get(x);
            if (count < minChars) {
                minChars = count;
            }
        }

        System.out.println(minChars + " String can be formed");
    }


    public static void main(String[] args) {

        String source = "ilovecodingodnleetco", target = "code";
        tF(source, target);
    }
}
