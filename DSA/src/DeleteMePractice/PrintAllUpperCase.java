package DeleteMePractice;

public class PrintAllUpperCase {
    static void tF() {
        String str = "PooRnaCh";
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                System.out.print("" + c);
            }
        }
    }

    public static void main(String[] args) {
        tF();

    }
}
