package java8;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MethodReference {

    public MethodReference(String s) {
        System.out.println("Hello " + s);
    }

    public static int addMe(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {//Example of object reference as println is inside system.out.
        // Arrays.asList("Poorna", "Monisha", "Sowji").stream().filter(s -> s.length() > 5).forEach(System.out::println);

        // Arrays.asList("Poorna", "Monisha", "Sowji").stream().map(String::length).forEach(System.out::println);
        //Arrays.asList("Poorna", "Monisha", "Sowji").stream().forEach(MethodReference::new);

        // Arrays.asList("Poorna", "Monisha", "Sowji").forEach(String::toUpperCase);

       /* List<List<Integer>>
                ls = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6));
        ls.stream().flatMap(List::stream).forEach(System.out::println);*/

        peekUsage();

    }

    public static void peekUsage() {

        Arrays.asList(1, 2, 3).stream().peek(s -> System.out.println(s)).forEach(System.out::println);
    }

}
