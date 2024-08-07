package DeleteMePractice;

public class BestTimeToBuyAndSellSTock {

    public static void main(String[] args) {

        int array[] = {7, 1, 5, 3, 6, 4};
        int minPrice = array[0];
        int maxProfit = 0;

        for (int i = 1; i < array.length; i++) {
            maxProfit = Math.max(maxProfit, array[i] - minPrice);
            minPrice = Math.min(minPrice, array[i]);
        }
        System.out.println(maxProfit);
    }


}
