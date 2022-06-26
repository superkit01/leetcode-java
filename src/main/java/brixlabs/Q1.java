package brixlabs;

import java.io.IOException;

public class Q1 {


    public static int isPrime(long n) {
        if (n == 2L) return 1;

        int v = (int) Math.ceil(Math.sqrt(n));
        for (int i = 2; i <= v; i++) {
            if (n % i == 0) {
                return i;
            }
        }
        return 1;


    }


    public static void main(String[] args) throws IOException {
        System.out.println(Q1.isPrime(100));
    }

}
