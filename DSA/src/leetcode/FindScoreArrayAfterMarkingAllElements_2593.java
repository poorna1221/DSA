package leetcode;

import java.sql.Array;

public class FindScoreArrayAfterMarkingAllElements_2593 {
    public static void main(String[] args) {
        int arr[] = {2, 1, 3, 4, 5, 2};


        int sumOfMarkedElements = 0;

        int min = arr[0], minIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
        }

        int newArray[] = new int[5];

      
    }


}
