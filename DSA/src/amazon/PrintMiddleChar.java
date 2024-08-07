package amazon;

public class PrintMiddleChar {
    static void tF() {

    }

    public static void main(String[] args) {
        String inputString = "Amazon";
        char chArr[] = inputString.toCharArray();

        int length = inputString.length();

        int mid = length / 2;

        if (length % 2 == 0) {
            System.out.print(String.valueOf(chArr[mid - 1]) + String.valueOf(chArr[mid]));
            System.out.print(String.valueOf(inputString.charAt(mid - 1)) + String.valueOf(inputString.charAt(mid)));
        } else {
            System.out.println(String.valueOf(chArr[mid]));
            System.out.println(String.valueOf(inputString.charAt(mid)));
        }
    }
}
