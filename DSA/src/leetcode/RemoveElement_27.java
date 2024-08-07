package leetcode;

import java.util.Arrays;

public class RemoveElement_27 {


    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        return k;

    }

    public static void main(String[] args) {
        RemoveElement_27 s = new RemoveElement_27();
        int nums[] = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(s.removeElement(nums, 2));
    }
}
