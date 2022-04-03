package week75;


/**
 * chapter6036
 * https://leetcode-cn.com/problems/sum-of-scores-of-built-strings/solution/
 */
public class Q4 {


    //error TLE
    public static long sumScores(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result += getPrefixLen(s.substring(s.length() - 1 - i), s);
        }
        return result;
    }

    private static int getPrefixLen(String si, String s) {
        if (s.startsWith(si)) {
            return si.length();
        }

        for (int i = 0; i < si.length(); i++) {
            if (si.charAt(i) != s.charAt(i)) {
                return i;
            }
        }
        return si.length();
    }


    public static void main(String[] args) {
        System.out.println(sumScores("babab"));
    }

}
