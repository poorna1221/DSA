package amazon;

public class ReverseVowelsOfString {
    public static final String vowels = "aeiouAEIOU";

    static void reverse() {

        String str = "poornae";
        StringBuilder sb = new StringBuilder();
        int j = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            if (!isVowel(str.charAt(i))) {
                sb.append(str.charAt(i));

            } else {
                while (j >= 0 && !isVowel(str.charAt(j))) {
                    j--;
                }
                sb.append(str.charAt(j--));
            }
        }
        System.out.println(sb.toString());
    }

    static void reverse2() {
        String str = "poornae";

        char c[] = str.toCharArray();

        int k = 0;
        int j = c.length - 1;
        for (int i = 0; i <= (0 + j) / 2; i++) {

            if (isVowel(c[i])) {
                while (!isVowel(c[j]) && j >= 3) {
                    j--;
                }
                swap(c, i, j--);
            } else {
                c[i] = c[i];
            }
        }
        System.out.println(c);
    }

    public static void swap(char c[], int i, int j) {

        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }

    public static boolean isVowel(char c) {

        if (vowels.indexOf(c) == -1) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        reverse();
        reverse2();

    }
}
