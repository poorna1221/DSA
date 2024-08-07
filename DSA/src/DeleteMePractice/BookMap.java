package DeleteMePractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookMap {

    public static void main(String[] args) {
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
                List<String> booksList = new ArrayList<>();
                booksList.add(book);
                newmap.put(author, booksList);
            }

        });


       /* newmap.forEach((k, v) -> {

            List<String> booksList = v;

            for (String book : booksList) {
                System.out.println("author is" + k + " books are " + book);
            }


        });*/

        for (Map.Entry mpe : newmap.entrySet()) {

            List<String> booksList = (List<String>) mpe.getValue();

            for (String book : booksList) {
                System.out.println(mpe.getKey() + " book is " + book);
            }

        }
    }
}
