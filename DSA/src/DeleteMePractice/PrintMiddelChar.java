package DeleteMePractice;

public class PrintMiddelChar {
    static void tF() {

    }

    public static void main(String[] args) {
        String str = "Amazon";
        int mid = (0 + str.length() - 1) / 2;
        if (str.length() % 2 == 0) {
            System.out.println(str.charAt(mid) + "" + str.charAt(mid + 1));
        } else {
            System.out.println(str.charAt(mid));
        }

    }
}
