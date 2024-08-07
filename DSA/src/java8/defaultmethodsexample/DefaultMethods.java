package java8.defaultmethodsexample;

public class DefaultMethods implements PoornaInterface {

    public static void main(String[] args) {

        PoornaInterface i = n -> n * n;
        System.out.println(i.square(10));

        System.out.println(i.square2(5));
    }

    @Override
    public int square(int n) {
        return 0;
    }
    
}
