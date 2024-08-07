package DeleteMePractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BooksMap {
    static void booksMap() {

        Map<String, String> oMap = new HashMap<>();
        oMap.put("Java", "John");
        oMap.put("Rails", "Rob");
        oMap.put("Ruby", "John");
        oMap.put("C#", "Rob");

        Map<String, List<String>> ansMap = new HashMap<>();

        for (Map.Entry<String, String> mpe : oMap.entrySet()) {
            String book = mpe.getKey();
            String author = mpe.getValue();

            if (ansMap.containsKey(author)) {
                ansMap.get(author).add(book);
            } else {
                List<String> booksList = new ArrayList<>();
                booksList.add(book);
                ansMap.put(author, booksList);
            }

        }

        ansMap.forEach((k, v) -> {
            System.out.println("Author is " + k + " their books are" + v);
        });

    }

    public static void main(String[] args) {

        booksMap();
    }
}
