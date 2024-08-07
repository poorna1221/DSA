package DeleteMePractice;

import java.util.HashMap;
import java.util.Map;

public class FindWordPattern {
    static void findWordPattern() {
        String pattern = "abba";
        boolean mismatch = false;
        String arr[] = {"cat", "dog", "set", "cat"};
        Map<Character, String> mp = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            if (!mp.containsKey(pattern.charAt(i))) {
                mp.put(pattern.charAt(i), arr[i]);
            }
        }

        for (int j = 0; j < pattern.length(); j++) {
            if (!arr[j].equals(mp.get(pattern.charAt(j)))) {
                mismatch = true;
            }
        }
        if (mismatch) System.out.println("not matching");
        else System.out.println("matching");

    }

    public static void main(String[] args) {
        findWordPattern();

    }
}
