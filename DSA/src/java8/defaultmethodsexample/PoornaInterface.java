package java8.defaultmethodsexample;

public interface PoornaInterface {

    public int square(int n);

    default int square2(int n) {

        return 3 * n;
    }
}
