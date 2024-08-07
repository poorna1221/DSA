package amazon;

public class SwapTwoIntegersSingleLine {
    static void tF() {

        int x = 10, y = 5;

        int temp = y;
        y = x;
        x = temp;

        System.out.println("x is " + x + " and y is" + y);

    }


    public static void main(String[] args) {

        int x = 10, y = 5;

        x = (x + y) - (y = x);

        System.out.println("x is " + x + " and y is" + y);
        
    }
}
