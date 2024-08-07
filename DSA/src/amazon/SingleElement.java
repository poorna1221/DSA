package amazon;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SingleElement {
    static void singleElement() {

        // 1,1 = 0 & 0,0,=0
        //1,0=1 && 0,1=1

        int arr[] = {2, 1, 4, 1, 2};

        int result = 0;
        for (int i : arr) {
            System.out.println("XOR of" + result + "  and " + i);
            result = result ^ i;//With XOR same elements gets cancelled each other hence
            //// only 4 which is single element will be remaining.
            System.out.println(result);

        }
        System.out.println(result);
    }

    static void singleElementHasSet() {

        int arr[] = {2, 1, 4, 1, 2};

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (list.contains(arr[i])) {
                list.remove(new Integer(arr[i]));
                //set.remove will remove object while list.remove will try to
                //remove the element at index and if we want to remove the object
                //type cast it to new Integer(arr[i]) so complier tries to find object
                // satisfying that value instead of index.
                System.out.println("Removed from list " + list);
            } else {
                list.add(arr[i]);
                System.out.println("Added to list " + list);
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        //singleElement();
        singleElement();

    }
}
