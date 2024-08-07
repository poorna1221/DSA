package java8.interview;

import java.util.Arrays;
import java.util.Comparator;

public class DiffMaxTwoNumbers {

    public static void main(String[] args) {

        int c[] = {1, 6, 3, 54, 45, 4, 8, 62};

        int arr[] = Arrays.stream(c).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();

        System.out.println(arr[0] - arr[1]);

    }

}
