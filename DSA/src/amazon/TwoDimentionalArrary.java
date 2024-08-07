package amazon;

import java.util.Arrays;

public class TwoDimentionalArrary {
    static int sumDiagonalElementsOfArrary(int[][] a) {

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i][i];

        }
        System.out.println("sum is " + sum);
        return sum;

    }

    static void printAllElements(int[][] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);

            }
            System.out.println();
        }
        System.out.println("-----------------");

        for (int[] subArr : a) {
            for (int i : subArr) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("-----------------");

        for (int[] x : a) {
            System.out.println(Arrays.toString(x));
        }

    }

    public static void main(String[] args) {
        int[][] arr =

                {{1, 2, 3, 5}, {4, 5, 6}, {9, 10, 11, 12}

                };
        sumDiagonalElementsOfArrary(arr);

    }
}
