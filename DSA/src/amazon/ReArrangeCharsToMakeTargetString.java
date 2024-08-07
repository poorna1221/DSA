package amazon;// Java program to implement a stack that supports
// getMaximum() in O(1) time and O(1) extra space.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class ReArrangeCharsToMakeTargetString {


    public static int[] getFrequencyOfString(String str) {

        int freq[] = new int[26];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }


        return freq;
    }


    public static void getFrequencyOfString_Map(String source, String target) {

        int currentMinimumCount = Integer.MAX_VALUE;
        Map<Character, Integer> mp = new HashMap<>();

        for (char c : source.toCharArray()) {

            mp.put(c, mp.getOrDefault(c, 0) + 1);

        }

        for (char c : target.toCharArray()) {
            Integer count = mp.get(c);
            if (currentMinimumCount > count) {
                currentMinimumCount = count;
            }
        }

        System.out.println("max strings can be formed are  " + currentMinimumCount);

    }

    public static void main(String[] args) {

        String source = "idlovecodingonleetco", target = "code";

        int sourceArra[] = getFrequencyOfString(source);
        int targetArrary[] = getFrequencyOfString(target);

        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < 26; i++) {

            if (targetArrary[i] > 0) {
                answer = Math.min((sourceArra[i] / targetArrary[i]), answer);
            }
        }
        System.out.println(answer);

        getFrequencyOfString_Map(source, target);

    }
}
 