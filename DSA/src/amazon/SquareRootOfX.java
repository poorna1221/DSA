package amazon;

public class SquareRootOfX {
    static int tF() {

        int x = 16;
        long left = 0;
        long right = (x / 2) + 1;

        while (left < right) {

            long mid = (left + (right - left) / 2 + 1);

            long square = mid * mid;
            if (square == x) {
                return (int) mid;
            } else if (square < mid) {
                left = mid;

            } else {
                right = mid - 1;
            }

        }
        return (int) left;
    }

    public static void main(String[] args) {
        System.out.println(tF());

    }
}
