package amazon;

public class EnumTest {


    public void yourOpinion(TESTENUM.DAYENUM day) {

        switch (day) {


            case TUESDAY:
                System.out.println("I am excited TUESDAY");
                break;
            case WEDNESDAY:
                System.out.println("I am excited WEDNESDAY");
                break;
            case THUR:
                System.out.println("I am excited THUR");
                break;
            case MONDAY:
                System.out.println("I am excited MONDAY");
                break;
            default:
                System.out.println("Invalid");
                break;
        }


    }

    public static void main(String[] args) {

        EnumTest et = new EnumTest();
        et.yourOpinion(TESTENUM.DAYENUM.TUESDAY);
    }
}