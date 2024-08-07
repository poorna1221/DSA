package amazon;

public class ReadAllUpperCase {
    static void triagle() {
        int a = 1, b = 10, c = 101;

        if (a == b && b == c) {
            System.out.println("Equilateral triagle");
        } else if (a == b || b == c || a == c) {
            System.out.println("Iscocelse triagle");
        } else {
            System.out.println("Scalene triagle");
        }
    }

    public static void main(String[] args) {
        String str = "PooRnaCh";
        StringBuilder sb = new StringBuilder();
        char upperCase[] = str.toCharArray();
        for (char ch : upperCase) {
            if (Character.isUpperCase(ch)) {
                sb.append(ch);
            }

        }

        System.out.println(sb.toString());
        //triagle();
    }
}
