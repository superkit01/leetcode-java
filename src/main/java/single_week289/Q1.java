package single_week289;

import java.util.Arrays;

public class Q1 {

    public static String digitSum(String s, int k) {
        if (s.length() <= k) {
            return s;
        }

        while (s.length() > k) {
            String stemp = "";

            for (int i = 0; i * k < s.length(); i++) {
                String temp = "";
                if ((i+1) * k >= s.length()) {
                    temp = s.substring(i * k);
                } else {
                    temp = s.substring(i * k, (i+1) * k);
                }
                int sum = 0;
                for (int j = 0; j < temp.length(); j++) {
                    sum += temp.charAt(j) - '0';
                }
                stemp += sum;
            }
            s = stemp;
        }

        return s;

    }


    public static void main(String[] args) {
        System.out.println(digitSum("11111222223", 3));
    }
}
