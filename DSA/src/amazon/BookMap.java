package amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookMap {
    static void tF() {
        Map<String, String> mp = new HashMap<String, String>();

        Map<String, List<String>> newmap = new HashMap<>();


        mp.put("Java", "John");
        mp.put("Rails", "Rob");
        mp.put("Ruby", "John");

        mp.put("C#", "Rob");

        mp.forEach((book, author) -> {


            if (newmap.containsKey(author)) {
                newmap.get(author).add(book);
            } else {
                List<String> ls = new ArrayList<>();
                ls.add(book);
                newmap.put(author, ls);

            }


        });


        newmap.forEach((b, a) -> {
            System.out.println(b + " value is " + a);
        });
    }


    static void tF_2() {
        Map<String, String> mp = new HashMap<String, String>();

        Map<String, List<String>> newmap = new HashMap<>();


        mp.put("Java", "John");
        mp.put("Rails", "Rob");
        mp.put("Ruby", "John");

        mp.put("C#", "Rob");

        mp.forEach((book, author) -> {

            if (newmap.containsKey(author)) {

                newmap.get(author).add(book);

            } else {
                List<String> booksList = new ArrayList();
                booksList.add(book);
                newmap.put(author, booksList);
            }

        });


        for (Map.Entry<String, List<String>> mpe : newmap.entrySet()) {

            System.out.println("AUthor is" + mpe.getKey() + " Books are " + mpe.getValue());
        }
    }

    public static void main(String[] args) {
        tF_2();

    }
}
