package week75;

import java.util.ArrayList;
import java.util.List;


/**
 * chapter 6033
 *
 * https://leetcode-cn.com/problems/minimum-bit-flips-to-convert-number/
 *
 */
public class Q1 {
    public int minBitFlips(int start, int goal) {


        List<Integer> startList = toBinArr(start);
        List<Integer> goalList = toBinArr(goal);

        int result = 0;

        for (int i = 0; i < startList.size() || i < goalList.size(); i++) {

            if (i >= startList.size()) {
                if (goalList.get(i) == 1) {
                    result++;
                }
            } else if (i >= goalList.size()) {
                if (startList.get(i) == 1) {
                    result++;
                }
            } else if (!goalList.get(i).equals(startList.get(i))) {
                result++;
            }
        }
        return result;
    }

    public List<Integer> toBinArr(int value) {
        List<Integer> result = new ArrayList<>();
        while (value > 0) {
            result.add(value % 2);
            value = value / 2;
        }
        return result;
    }


    public static int minBitFlips2(int start, int goal) {
        int value = start ^ goal;
        int result = 0;
        while (value > 0) {
            if (value % 2 == 1) {
                result++;
            }
            value /= 2;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(minBitFlips2(3, 4));
    }

}
