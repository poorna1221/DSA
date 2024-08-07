package java8.functionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        FunctionExample fe = new FunctionExample();
//        fe.functionExampleWithStringLength();
        fe.functionExampleWithStringLength();
    }

    public void functionExampleWithStringLength() {
        Function<String, Integer> f = s -> s.length();
        System.out.println(f.apply("Poorna"));

        List<String> ls = new ArrayList<String>();
        ls.add("Poorna");
        ls.add("Sowji");
        ls.add("Mukkanti");
        ls.add("Arun");

        ls.stream().filter(s -> s.length() > 4).map(s -> f.apply(s)).forEach(System.out::println);
    }

    public void functionExampleWithSquareOfInteger() {

        Function<Integer, Integer> fi = n -> n * n;
        System.out.println(fi.apply(8));
    }

}
