package leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber_202 {

    int tempResult = 0;
    Set<Integer> set = new HashSet<Integer>();
    int result = 0;

    public boolean isHappy(int n) {

        while (n != 1) {

            while (n > 0) {
                result = result + (n % 10) * (n % 10);
                n = n / 10;
            }
            if (set.contains(result)) {
                return false;
            } else {
                set.add(result);
            }
            n = result;
        }

        return true;
    }

    public static void main(String[] args) {
        HappyNumber_202 s = new HappyNumber_202();
        System.out.println(s.isHappy(19));

    }
}
