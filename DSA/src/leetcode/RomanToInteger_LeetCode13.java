package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_LeetCode13 {


    public int romanToInt(String s) {
        Map<String, Integer> mp = new HashMap<String, Integer>();
        int result = 0;
        mp.put("I", 1);
        mp.put("V", 5);
        mp.put("X", 10);
        mp.put("L", 50);
        mp.put("C", 100);
        mp.put("D", 500);
        mp.put("M", 1000);
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && mp.get(String.valueOf(s.charAt(i))) < mp.get(String.valueOf(s.charAt(i + 1)))) {
                result = result - mp.get(String.valueOf(s.charAt(i)));
            } else {
                result = result + mp.get(String.valueOf(s.charAt(i)));
            }
// usually roman nos will be in decremeting order VI=  V[5]I[1][5+1] - which means =6
//but if roman no is IV then value is 4[-1+5] similarly for MCMXCIV[1000-100+1000-10+100-1+5]

        }

        return result;
    }

    public static void main(String[] args) {
        RomanToInteger_LeetCode13 tl = new RomanToInteger_LeetCode13();
        String s = "MCMXCIV";
        System.out.println(tl.romanToInt(s));

    }
}