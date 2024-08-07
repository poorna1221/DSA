package amazon;

public class BinarySearch {

    static int bS(int[] arr, int targetElement) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (targetElement == arr[mid]) {
                return mid;
            } else if (targetElement <= arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        System.out.println(bS(arr, 3));


    }

}
