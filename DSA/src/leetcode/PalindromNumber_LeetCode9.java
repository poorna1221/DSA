package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PalindromNumber_LeetCode9 {


    public boolean isPalindrome(int x) {
        int reverse = 0;
        int originalNumber = x;
        while (x > 0) {
            reverse = (reverse * 10) + (x % 10);
            x = x / 10;
        }
        if (reverse == originalNumber)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        PalindromNumber_LeetCode9 tl = new PalindromNumber_LeetCode9();
        int x = 143;
        System.out.println(tl.isPalindrome(x));

    }
}