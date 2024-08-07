package amazon;

import java.util.LinkedList;

public class RemoveDuplicateChars {
    static String removeDuplicates(String s) {

        int charCountArrary[] = new int[26];

        LinkedList<Character> resultLinkedList = new LinkedList<Character>();

        boolean charInsertedBoolArrary[] = new boolean[26];


        for (char ch : s.toCharArray()) {
            charCountArrary[ch - 'a']++;
        }

        for (char ch : s.toCharArray()) {
            charCountArrary[ch - 'a']--;

            if (charInsertedBoolArrary[ch - 'a'])
                continue;

            while (!resultLinkedList.isEmpty() && resultLinkedList.getLast() > ch && charCountArrary[resultLinkedList.getLast() - 'a'] > 0) {
                char removedChar = resultLinkedList.removeLast();
                charInsertedBoolArrary[removedChar - 'a'] = false;
            }

            resultLinkedList.add(ch);
            charInsertedBoolArrary[ch - 'a'] = true;

        }

        StringBuilder sb = new StringBuilder();

        while (!resultLinkedList.isEmpty()) {
            sb.append(resultLinkedList.removeFirst());
        }


        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println("lexico string is " + removeDuplicates("cbacdcbc"));
    }
}
