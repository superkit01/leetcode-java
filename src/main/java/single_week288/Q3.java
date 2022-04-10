package single_week288;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Q3 {
    public static int maximumProduct(int[] nums, int k) {

        if (nums.length == 1) {
            nums[0] += k;
            return nums[0];
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Arrays.stream(nums).forEach(i -> queue.offer(i));

        while (k > 0) {
            Integer v = queue.poll();
            v++;
            queue.offer(v);
            k--;
        }

        long result = queue.poll().longValue();
        while (queue.size() > 0) {
            result = result * queue.poll();
            result %= 1000000007;

        }
        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println(maximumProduct(new int[]{1, 2, 3, 6, 7, 88}, 10));
    }
}
