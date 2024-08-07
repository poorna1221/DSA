package amazon;

public class LengthOfLastWordInString {
    static void lengthOfLastWordInString() {

        String str = "Hello World    ";
        int length = 0, i = str.length() - 1;

        while (i >= 0 && str.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && str.charAt(i) != ' ') {
            length++;
            i--;
        }

        System.out.println(length);
    }

    static void lengthOfLastWordInString_3() {

        String str = "Hello Wosrld    ";
        int length = 0; //i = str.length() - 1;

        String arr[] = str.split(" ");
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[arr.length - 1].length());
        }

        //System.out.println(length);
    }


    public static void main(String[] args) {
        //lengthOfLastWordInString();
      
    }
}
