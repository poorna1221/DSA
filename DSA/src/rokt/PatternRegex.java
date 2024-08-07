package rokt;

public class PatternRegex {

    public void explanation() {

    }

    public void test() {

        String Str = "The string has the number 10.";
        System.out.println(Str.matches("(.*)[0-9](.*)"));
        System.out.println(Str.matches("The.*"));//"The.*"  or "The(.*)"
    }

    public static void main(String[] args) {
        PatternRegex s = new PatternRegex();
        s.test();
    }
}
