package leetcode;

import java.util.*;

public class TwoSum_LeetCode1 {

    public int[] twoSum_1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {

            for (int j = (i + 1); j < nums.length; j++) {
                //we can either do j=0 or j=i+1, but j=i+1 then number of interations are reduced
                //as we don't need to sum the previous elements as they are already summed up

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }

            }
        }
        return nums;
    }

    public int[] twoSum_2(int[] nums, int target) {
        List<Integer> ls = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (ls.contains(target - nums[i])) {
                return new int[]{i, ls.indexOf(target - nums[i])};
            } else {
                ls.add(nums[i]);
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        TwoSum_LeetCode1 tl = new TwoSum_LeetCode1();
        int nums[] = {2, 11, 7, 15};
        int target = 9;
        int arr[] = tl.twoSum_2(nums, target);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
