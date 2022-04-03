package week75;

/**
 *
 * chapter6035
 *
 * https://leetcode-cn.com/problems/number-of-ways-to-select-buildings/
 */
public class Q3 {

    //error   TLE
    public  static long numberOfWays(String s) {
        long result = 0;
        char[] charArr = s.toCharArray();
        for (int i = 0; i < charArr.length - 2; i++) {
            mid:
            for (int j = i + 1; j < charArr.length - 1; j++) {
                if (charArr[i] == charArr[j]) {
                    continue mid;
                }

                inner:
                for (int k = charArr.length - 1; k > j; k--) {
                    if (charArr[k] ==  charArr[j]) {
                        continue inner;
                    }
                    result++;
                }

            }

        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println( numberOfWays("001101"));
    }
}
