package java8.supplier;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.function.Supplier;

public class TestSupp {
    public static void main(String[] args) {
        Supplier<String> ss = () -> String.valueOf(LocalDateTime.now());
        System.out.println(ss.get());
    }
}
