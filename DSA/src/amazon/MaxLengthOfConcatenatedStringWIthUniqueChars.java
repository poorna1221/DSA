package amazon;

import com.sun.javafx.image.BytePixelSetter;

import java.util.HashMap;
import java.util.Map;

public class MaxLengthOfConcatenatedStringWIthUniqueChars {
    static void maxLength() {

        StringBuilder sb = new StringBuilder();
        String arr[] = {"cha", "r", "act", "ers"};
        Map<Character, Integer> mp = new HashMap<>();
        for (String str : arr) {
            boolean charFound = false;
            for (char c : str.toCharArray()) {

                if (mp.containsKey(c)) {

                    charFound = true;

                } else {
                    mp.put(c, mp.getOrDefault(c, 0) + 1);
                }
            }
            if (!charFound) {
                
                sb.append(str);
            }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {

        maxLength();
    }
}
