package DeleteMePractice;

import java.util.Arrays;

public class ReverseStringRecuression {
    static String vowels = "aeiouAEIOU";

    static void tF() {
        String str = "poornae";
        StringBuilder sb = new StringBuilder();

        int j = str.length() - 1;

        for (int i = 0; i < str.length(); i++) {

            if (isVowel(str.charAt(i))) {

                while (!isVowel(str.charAt(j))) {
                    j--;
                }
                sb.append(str.charAt(j--));
            } else {
                sb.append(str.charAt(i));
            }


        }
        System.out.println("" + sb.toString());
    }

    static void reverseVowels() {
        String str = "poornae";
        char ch[] = str.toCharArray();
        int j = str.length() - 1;
        for (int i = 0; i < str.length() / 2; i++) {

            if (isVowel(ch[i])) {

                while (j >= (str.length() / 2) && !isVowel(str.charAt(j))) {
                    j--;
                }

                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                j--;

            }
        }

        System.out.println(Arrays.toString(ch));
    }

    static boolean isVowel(char c) {
        if (vowels.indexOf(c) == -1) {
            return false;
        } else
            return true;
    }

    public static void main(String[] args) {

        reverseVowels();
    }
}
