package rahulshetty;

public class ArrayMedian {
    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4};
        int arrLength = a.length;
        float median = (float) ((sumOfArrary(a) / arrLength));
        System.out.println("MEDIAN is" + median);


    }

    public static float sumOfArrary(int a[]) {
        int sum = 0;
        for (int i = 0; i < (a.length); i++) {
            sum = sum + a[i];
        }
        return (float) sum;
    }

}
