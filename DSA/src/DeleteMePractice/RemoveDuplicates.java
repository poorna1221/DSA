package DeleteMePractice;

import java.util.Arrays;

public class RemoveDuplicates {
    static void removeTargeElement() {
        int arr[] = {2, 3, 1, 1, 4, 2};
        int newarr[] = new int[arr.length - 2];
        int target = 2;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                continue;
            } else {
                arr[j] = arr[i];
                j++;
            }
        }
        while (j < arr.length) {
            arr[j++] = 0;
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {

        removeTargeElement();
    }
}
