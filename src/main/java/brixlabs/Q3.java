package brixlabs;

import java.io.IOException;

public class Q3 {

    final static String regularExpression = "^([a-z]{1,6}_?[0-9]{0,4}@hackerrank.com)$";

    public static void main(String[] args) throws IOException {
        System.out.println("jam@hackerrank.com".matches(regularExpression));
    }
}
