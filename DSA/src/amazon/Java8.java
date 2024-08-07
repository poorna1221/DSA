package amazon;

import java.util.Arrays;
import java.util.Comparator;

public class Java8 {
    class Student {

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        private String name;
        private String age;

        Student(String name, String age) {
            this.name = name;
            this.age = age;
        }

    }

    void tF() {
        Student st1 = new Student("Poorna", "21");
        Student st2 = new Student("Sowji", "27");
        Student st3 = new Student("Arun", "33");

        Student str = Arrays.asList(st1, st2, st3).stream().min(Comparator.comparing(e -> e.getAge())).get();
        System.out.println(str.getName() + " " + str.getAge());
    }

    public static void main(String[] args) {

        Java8 j = new Java8();
        j.tF();
        // String strArry[] = {"SOwjanya", "Sai", "Poorna"};
        //Arrays.asList(strArry).stream().map(e -> e.toUpperCase()).filter(s -> s.length() > 3).forEach(System.out::println);


        //Stream.of(strArry).map(e -> e.toLowerCase()).filter(s -> s.contains("oo")).forEach(System.out::println);

        //Arrays.asList(strArry).stream().map(e -> e.toUpperCase()).limit(4).forEach(System.out::println);

        //System.out.println(Arrays.asList(1, 2, 3, 4, 56, 7, 89, 10).stream().max(Comparator.comparing(a -> a)).get());

        //Arrays.asList(1, 2, 3, 4, 56, 7, 89, 10).stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.println(e));


        System.out.println(Arrays.asList(1, 2, 3, 4, 56, 7, 89, 10).stream().min(Comparator.comparing(a -> a)).get());
    }
}
