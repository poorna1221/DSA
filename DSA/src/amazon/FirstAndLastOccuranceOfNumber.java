package amazon;

import java.util.ArrayList;
import java.util.List;

public class FirstAndLastOccuranceOfNumber {
    static void tF() {

        int k = 2;
        int arr[] = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        List<Integer> ls = new ArrayList<>();
        for (int i : arr) {
            ls.add(i);
        }


        System.out.println(ls.indexOf(k));
        System.out.println(ls.lastIndexOf(k));
    }

    static void firstAndLastOccuranceOfNumber() {

        int k = 2;
        int arr[] = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int firstOcur = -1;
        int lastOcur = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == k && firstOcur == -1) {
                firstOcur = i;
            } else if (arr[i] == k) {
                lastOcur = i;
            }
        }
        System.out.println("First is " + firstOcur + " last occ is" + lastOcur);
    }

    static void firstlast() {

        int k = 2;
        int arr[] = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int firstOcur = -1;
        int lastOcur = -1;


    }

    public static void main(String[] args) {
        tF();
        firstAndLastOccuranceOfNumber();
    }
}
