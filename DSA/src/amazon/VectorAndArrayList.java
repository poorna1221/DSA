package amazon;

import java.util.*;

public class VectorAndArrayList {
    static void vector() {

        Vector<Integer> vc = new Vector<>();
        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            vc.add(rand.nextInt(100));
        }

        Vector<Integer> vc1 = (Vector<Integer>) vc.clone();
        System.out.println(vc1);

        for (int i : vc) {
            System.out.println(i);
        }
    }

    static void al() {
        List<Integer> ls = new ArrayList<>();
        List<Integer> ls1 = new ArrayList<>();
        ls.add(2);
        ls.add(5);
        ls.add(3);
        ls.add(4);
        ls.add(0);


 /*       ls.add(0, 4);
        ls.add(0, 8);
        ls.add(0, 8);
        ls.add(0, 8);*/
       /* ls.add(4);
        System.out.println(ls);
        ls.set(0, 9);
        ls.remove(new Integer(4));*/
        System.out.println(ls);
        //
        //System.out.println(ls.subList(2, 4));
        ls.sort(Comparator.naturalOrder());

        for (int i : ls) {
            System.out.println(i);
        }


    }

    public static void main(String[] args) {
        al();

    }
}
