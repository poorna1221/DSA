package amazon;

public class PeekElement {
    //Element greater than its neighbour elements is called peek element
    static void findPeek() {
        int[] arr = {1, 2, 1, 3, 5, 6, 4};

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.println("Peek element is" + arr[i] + " and its index is" + i);
            }


        }
    }

    static int findPeekBinarySearch(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        findPeek();

      /*  int[] arr = {1, 2, 1, 7, 9, 3};
        System.out.println("index is" + findPeekBinarySearch(arr));
        System.out.println(arr[findPeekBinarySearch(arr)]);
        //System.out.println(arr[findPeekApproach(arr)]);*/

    }
}
