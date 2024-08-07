package java8;

public class LambaExpressions {

    public static void main(String[] args) {

        Inter i = n -> n * n;
        System.out.println(i.square(10));
    }

    interface Inter {
        public abstract int square(int n);
    }
}
