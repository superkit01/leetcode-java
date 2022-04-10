package single_week288;

import java.util.*;
import java.util.stream.Collectors;

public class Q1 {

    public static int largestInteger(int num) {
        if (num <= 10) {
            return num;
        }
        int length = String.valueOf(num).length();
        List<Integer> ji = new ArrayList<>();
        List<Integer> ou = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;

        while (num > 0) {
            int tempNum = num % 10;
            if (tempNum % 2 == 0) {
                ou.add(tempNum);
                map.put(i, 0);
            } else {
                ji.add(tempNum);
                map.put(i, 1);
            }
            i++;
            num = num / 10;
        }

        ji = ji.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        ou = ou.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        int result = 0;

        int m = 0;
        int n = 0;
        for (int k = 0; k < length; k++) {
            Integer t = null;
            if (map.get(length-1-k) == 0) {
                t = ou.get(n);
                n++;
            } else {
                t = ji.get(m);
                m++;
            }

            result = result * 10 + t;
        }


        return result;

    }


    public static void main(String[] args) {
        System.out.println(largestInteger(1234));
    }
}
