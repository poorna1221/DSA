package leetcode;

public class ImplementStrStr {

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        ImplementStrStr s = new ImplementStrStr();
        System.out.println(s.strStr("aaaaa", ""));
    }
}
