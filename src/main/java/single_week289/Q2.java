package single_week289;

import java.util.HashMap;
import java.util.Map;

public class Q2 {

    public static int minimumRounds(int[] tasks) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < tasks.length; i++) {
            if (!map.containsKey(tasks[i])) {
                map.put(tasks[i], 0);
            }
            map.put(tasks[i], map.get(tasks[i]) + 1);
        }


        int result = 0;
        for (Integer v : map.values()) {
            if (v == 1) {
                return -1;
            }
            if (v % 3 == 0) {
                result += v / 3;
            }else if (v%3==2){
                result+=(v/3+1);
            }else{
                result+=(v/3+1);
            }
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(minimumRounds(new int[]{2,2,3,3,2,4,4,4,4,4}));
    }
}
