package leetcode;

public class MaxSequenceElementsCount {

    public static void main(String[] args) {
        int a[] = {0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1};
        int zerosCount = 0, onesCount = 0, currentCount = 0, maxCount = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] == 0) {
                zerosCount++;
                onesCount = 0;
            } else {
                onesCount++;
                zerosCount = 0;
            }
            currentCount = Math.max(zerosCount, onesCount);
            maxCount = currentCount > maxCount ? currentCount : maxCount;
        }
        System.out.println("maxcount is" + maxCount);
    }
}
