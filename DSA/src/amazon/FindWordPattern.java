package amazon;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindWordPattern {
    static void tF() {
        String pattern = "abba";
        boolean mismatch = false;
        int m = 0;
        String words = "dog cat set dog";
        LinkedHashMap<Character, String> mp = new LinkedHashMap<>();
        String wordsArray[] = words.split(" ");
        for (int i = 0; i < pattern.length(); i++) {
            mp.put(pattern.charAt(i), wordsArray[i]);
        }

        for (int i = 0; i < pattern.length(); i++) {
            if (wordsArray[i].equals(mp.get(pattern.charAt(i)))) {

            } else {
                mismatch = true;
            }

        }
        if (mismatch) {
            System.out.println("Not valid pattern");
        } else {
            System.out.println("valid pattern");
        }
    }

    static boolean tF2(String pattern, String words) {

        boolean mismatch = false;
        int m = 0;

        LinkedHashMap<Character, String> mp = new LinkedHashMap<>();
        String wordsArray[] = words.split(" ");
        for (int i = 0; i < pattern.length(); i++) {

            if (mp.containsKey(pattern.charAt(i))) {
                if (!mp.get(pattern.charAt(i)).equals(wordsArray[i])) {
                    return false;
                }
            } else {
                mp.put(pattern.charAt(i), wordsArray[i]);
            }


        }

        return true;
    }

    public static void isMatching() {
        String pattern = "abba";
        String words = "dog cat cat dog";
        if (tF2(pattern, words)) {
            System.out.println("valid");
        } else {
            System.out.println("Not valid");
        }
    }

    public static void main(String[] args) {
        isMatching();

    }
}
