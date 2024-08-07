package amazon;

public class LongestCommonPrefix {
    static void tF() {

        String str[] = {"flght", "flgher", "flgx"};

        int smallestLenght = str[0].length();
        for (int i = 0; i < str.length; i++) {
            smallestLenght = Math.min(smallestLenght, str[i].length());

            for (int j = 0; j < smallestLenght; j++) {

                char c = str[0].charAt(j);
                char d = str[i].charAt(j);

                if (c != d) {
                    System.out.println("C is" + c + " d is " + d);
                    smallestLenght = j;
                    break;
                }
            }

        }
        System.out.println(str[0].substring(0, smallestLenght));

    }

    public static void main(String[] args) {
        tF();

    }
}
