package DeleteMePractice;

import java.util.*;

public class PrintAnargrams {
    static void printAnargrams() {
        String arr[] = {"cat", "dog", "tac", "ogd", "god", "act"};

        Map<String, List<String>> mp = new HashMap<>();
        String actualWord;
        for (int i = 0; i < arr.length; i++) {
            actualWord = arr[i];
            char chArr[] = arr[i].toCharArray();
            Arrays.sort(chArr);
            if (mp.containsKey(String.valueOf(chArr))) {
                mp.get(String.valueOf(chArr)).add(actualWord);
            } else {
                List<String> ls = new ArrayList<>();
                ls.add(actualWord);
                mp.put(String.valueOf(chArr), ls);
            }

        }

        for (Map.Entry mpe : mp.entrySet()) {
            System.out.println("key is" + mpe.getKey());
            System.out.println("Value is" + mpe.getValue());
        }
    }

    static void checkIfTwoStringsAreAnargam() {


        String X = "tommarvoloriddle";        // Tom Marvolo Riddle
        String Y = "iamlodrdvoldemort";        // I am Lord Voldemort

        Map<Integer, Integer> mp = new HashMap<>();
        for (int i : X.toCharArray()) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }

        for (int j : Y.toCharArray()) {
            mp.put(j, mp.get(j) - 1);

            if (mp.get(j) == 0) {
                mp.remove(j);
            }
        }


        int n = mp.isEmpty() ? 1 : 0;

        if (n == 1) {
            System.out.println("Anara");
        } else
            System.out.println("not Anara");
    }

    static void checkIfTwoStringsAreAnargam_2() {


        String X = "tommarvoloriddle";        // Tom Marvolo Riddle
        String Y = "iamlodrdvoldemort";       // I am Lord Voldemort
        List<Character> ls = new ArrayList<>();

        if (X.length() == Y.length()) {
            for (Character c : X.toCharArray()) {
                ls.add(c);
            }
            System.out.println("list is" + ls);

            for (Character c : Y.toCharArray()) {
                ls.remove(c);
            }
            if (ls.size() == 0) {
                System.out.println("ANargam");
            } else {
                System.out.println("NOt anargam");
            }

        } else {
            System.out.println("NOt anargam");
        }

    }

    static void checkIfTwoStringsAreAnargam_3() {


        String X = "tommarvoloriddle";        // Tom Marvolo Riddle
        String Y = "iamlodrdvoldemort";       // I am Lord Voldemort

        int freqXArray[] = new int[26];
        int freqYArray[] = new int[26];

        for (Character C : X.toCharArray()) {
            freqXArray[C - 'a']++;
        }
        for (Character C : Y.toCharArray()) {
            freqYArray[C - 'a']++;
        }
        if (Arrays.equals(freqXArray, freqYArray)) {
            System.out.println("ANargam");
        } else {
            System.out.println("NOt anargam");
        }

    }

    public static void main(String[] args) {
        checkIfTwoStringsAreAnargam_3();

    }
}
