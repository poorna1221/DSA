package DeleteMePractice;

public class LongestCommonPrefix {
    static void tF() {
        String str[] = {"flghts", "flgher", "flgs"};
        int minCount = Integer.MAX_VALUE;
        for (int i = 1; i < str.length; i++) {
            String str1 = str[0];
            String str2 = str[i];
            int k = 0, count = 0;
            while (k < str2.length() && str1.charAt(k) == str2.charAt(k)) {
                count++;
                k++;
            }

            minCount = Math.min(count, minCount);
        }

        for (int i = 0; i < minCount; i++) {
            System.out.println("" + str[0].charAt(i));
        }
    }

    static void commonPrefix() {
        String str[] = {"flght", "flgher", "flgx"};
        int smallestLength = str[0].length();
        for (int i = 0; i < str.length; i++) {

            smallestLength = Math.min(smallestLength, str[i].length());

            for (int j = 0; j < smallestLength; j++) {

                char c = str[0].charAt(j);
                char d = str[i].charAt(j);
                if (c != d) {
                    smallestLength = j;
                }
            }
        }
        System.out.println("" + str[0].substring(0, smallestLength));

    }

    public static void main(String[] args) {

        commonPrefix();
    }
}
