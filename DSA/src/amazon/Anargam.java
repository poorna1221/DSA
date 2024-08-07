package amazon;

import java.util.*;

public class Anargam {
    static void printAnagrams() {
        String arr[]
                = {"cat", "dog", "tac", "god"};


        Map<String, List<String>> mp = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            String actualWord = arr[i];
            char[] chArr = arr[i].toCharArray();
            Arrays.sort(chArr);
            //System.out.println(chArr);
            if (mp.containsKey(String.valueOf(chArr))) {

                mp.get(String.valueOf(chArr)).add(actualWord);

            } else {
                List<String> anarList = new ArrayList<>();
                anarList.add(actualWord);
                mp.put(String.valueOf(chArr), anarList);
            }

        }

        for (Map.Entry mpe : mp.entrySet()) {
            //System.out.println(mpe.getKey());
            List<String> ls = (List<String>) mpe.getValue();
            for (String s : ls) {
                System.out.println("Key is " + mpe.getKey() + " values are  " + s);
            }

        }
        System.out.println("----------");
        mp.forEach((key, value) -> {

            List<String> values = value;

            for (String s : values) {
                System.out.println("key is" + key + "value is" + s);
            }
        });
    }

    static void checkIfTwoStringsAreAnargam() {


        String X = "tommarvoloriddle";        // Tom Marvolo Riddle
        String Y = "iamlordvoldemort";        // I am Lord Voldemort

        Map<Character, Integer> mp = new HashMap<>();

        for (char c : X.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        for (char c : Y.toCharArray()) {
            mp.put(c, mp.get(c) - 1);

            if (mp.get(c) == 0) {
                mp.remove(c);
            }

        }


        if (mp.isEmpty()) {
            System.out.println("Anargams");
        } else {
            System.out.println("not anargams");
        }
    }

    static void checkIfTwoStringsAreAnargam_2() {


        String X = "tommarvoloriddle";        // Tom Marvolo Riddle
        String Y = "ziamlordvoldemort";        // I am Lord Voldemort
        List<Character> ls = new ArrayList<>();

        for (Character c : X.toCharArray()) {
            ls.add(c);
        }
        for (Character c : Y.toCharArray()) {
            ls.remove(c);
        }

        if (ls.size() == 0) {
            System.out.println("ANargam");
        } else {
            System.out.println("NOt anargam");
        }

    }

    static void checkIfTwoStringsAreAnargam_3() {

        String X = "iadvomlorortldim";        // Tom Marvolo Riddle
        String Y = "iamlordvoldimort";        // I am Lord Voldemort

        int c1[] = new int[26];
        int c2[] = new int[26];


      /*  for (int i = 0; i < X.length(); i++) {
            c1[(X.charAt(i)) - 'a']++;
        }
        for (int j = 0; j < Y.length(); j++) {
            c2[(Y.charAt(j)) - 'a']++;
        }*/

        for (char c : X.toCharArray()) {
            c1[c - 'a']++;
        }
        for (char c : Y.toCharArray()) {
            c2[c - 'a']++;
        }

        if (Arrays.equals(c1, c2)) {
            System.out.println("anargram");
        } else {
            System.out.println("not anargram");
        }


    }

    public static void main(String[] args) {
        //printAnagrams();
        //checkIfTwoStringsAreAnargam();
        printAnagrams();
    }
}
