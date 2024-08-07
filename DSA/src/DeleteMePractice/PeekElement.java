package DeleteMePractice;

public class PeekElement {
    static void findPeekElement() {
        int[] arr = {1, 3, 1, 2, 1, 1};
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.println(arr[i] + " is peek element");
            }
        }

    }

    static int findPeekElement_BS(int arr[]) {


        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 2, 1, 1};
        int pos = findPeekElement_BS(arr);
        System.out.println("" + arr[pos]);

    }
}
