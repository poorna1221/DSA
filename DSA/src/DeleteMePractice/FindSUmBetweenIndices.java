package DeleteMePractice;

public class FindSUmBetweenIndices {
    static void findSUmBetweenIndices(int start, int end) {
        int arr[] = {1, 2, 3, 4};
        int newArray[] = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArray[i + 1] = newArray[i] + arr[i];
        }
        for (int n : newArray) {
            System.out.println(n);
        }
        System.out.println("Difference is" + (newArray[end + 1] - newArray[start]));
    }

    public static void main(String[] args) {
        findSUmBetweenIndices(1, 2);

    }
}
