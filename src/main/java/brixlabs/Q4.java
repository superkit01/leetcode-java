package brixlabs;

import java.util.*;

public class Q4 {


    public static int stockPairs(List<Integer> stocksProfit, long target) {
        Set<String> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < stocksProfit.size(); i++) {
            if (!map.containsKey(stocksProfit.get(i))) {
                map.put(stocksProfit.get(i), 0);
            }
            map.put(stocksProfit.get(i), map.get(stocksProfit.get(i)) + 1);
        }

        for (int i = 0; i < stocksProfit.size(); i++) {
            Integer v = stocksProfit.get(i);
            if (map.containsKey(v) && map.get(v) > 0) {
                map.put(v, map.get(v) - 1);
                int remaining = (int) (target - stocksProfit.get(i));
                if (map.containsKey(remaining) && map.get(remaining) > 0) {
                    map.put(remaining, map.get(remaining) - 1);
                    set.add(v > remaining ? v + "," + remaining : remaining + "," + v);
                } else {
                    map.put(v, map.get(v) + 1);
                }
            }
        }
        return set.size();


    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(6);
        list.add(12);
        list.add(3);
        list.add(9);
        list.add(3);
        list.add(5);
        list.add(1);

        System.out.println(stockPairs(list, 12));

    }
}
