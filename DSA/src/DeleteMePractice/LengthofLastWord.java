package DeleteMePractice;

public class LengthofLastWord {
    static void lengthofLastWord() {
        String str = "Hell Wosrld    ";

        String strArray[] = str.split(" ");
       /* for (String s : strArray) {
            System.out.println(s.length());
        }*/

        System.out.println("" + strArray[strArray.length - 1].length());
    }

    static void lengthofLastWord_LOOP() {
        String str = "Hell Woxcrld  ";
        int length = 0;

        int endIndex = str.length() - 1;
        while (str.charAt(endIndex) == ' ') {
            endIndex--;
        }
        while (str.charAt(endIndex) != ' ') {
            length++;
            endIndex--;
        }
        System.out.println("" + length);
    }


    public static void main(String[] args) {
        lengthofLastWord_LOOP();

    }
}
