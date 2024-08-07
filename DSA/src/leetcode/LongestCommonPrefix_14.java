package leetcode;

public class LongestCommonPrefix_14 {


    public String longestCommonPrefix(String[] strs) {
        String s1 = strs[0];
        int n = s1.length();
        int answerIndexCount = Integer.MAX_VALUE;
        for (int i = 1; i < strs.length; i++) {
            String s2 = strs[i];
            int prefixCount = 0;
            n = Math.min(n, s2.length());
            for (int j = 0; j < n; j++) {
                char c = s1.charAt(j);
                char d = s2.charAt(j);
                if (c == d) {
                    prefixCount++;//for flower & flow prefix count will be 4, and for flight and
                    //flower & flight - common prefix count is 2, hence taking output as 0,2 substring of
                    //any of strings in list here I took one string
                }
            }
            answerIndexCount = prefixCount < answerIndexCount ? prefixCount : answerIndexCount;
           /* if (prefixCount < answerIndexCount) {
                answerIndexCount = prefixCount;
            }*/
        }

        return s1.substring(0, answerIndexCount);
    }

    public String longestCommonPrefix2(String[] strs) {
        String res = strs[0];
        for (int i = 0; i < strs.length; i++) {
            //System.out.println("out side loop String 1 is " + strs[i] + "  result is " + res + " index of is" + strs[i].indexOf(res));
            while (strs[i].indexOf(res) != 0) {
                /*
                here res will be searched inside strs[i] if found index will be returned, and here since we are
                checking first common prefix if legth is !0 we should keep removing the letter from result string
                until a common  match is found , once comon prefix is found index will be 0 as first few chars are matched
                * */
                // System.out.println("inside loop String 1 is " + strs[i] + "  result is " + res + " index of is" + strs[i].indexOf(res));
                res = res.substring(0, res.length() - 1);
                // System.out.println(res);
            }
        }
        return res;
    }


    public static void main(String[] args) {
        LongestCommonPrefix_14 tl = new LongestCommonPrefix_14();
        String strs[] = {"flow", "flower", "flight"};//"dog","racecar","car"
        System.out.println(tl.longestCommonPrefix(strs));

    }
}