package DeleteMePractice;

public class Enum {

    public void testEnumSwitch(String value) {

        switch (value) {

            case "Arun":
                System.out.println("Hello Arun");
                break;

            case "Poorna":
                System.out.println("Hello Poorna");
                break;

            default:
                System.out.println("Hello default");
                break;
        }
    }

    public enum TestEnum {

        Arun,
        Poorna,
        Sowji,
        Shailu
    }

    public static void main(String[] args) {
        Enum e = new Enum();
        e.testEnumSwitch(TestEnum.Shailu.toString());
    }
}
