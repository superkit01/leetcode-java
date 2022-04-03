package week75;

/**
 * chapter6034
 *
 * https://leetcode-cn.com/problems/find-triangular-sum-of-an-array/
 *
 */
public class Q2 {
    public static int triangularSum(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }
        int turn = nums.length;
        while (true) {
            if (turn == 1) {
                break;
            }
            for (int i = 0; i < nums.length - 1; i++) {
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            }
            turn--;
        }
        return nums[0];
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        System.out.println( triangularSum(arr));
    }

}
