package brixlabs;

public class Q2 {


    public static int getMin(String s) {
        int left = 0;
        int result = 0;

        char[] charArr = s.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == '(') {
                left++;
            } else {
                if (left == 0) {
                    result++;
                } else {
                    left--;
                }
            }
        }

        return result + left;


    }

    public static void main(String[] args) {

        System.out.println(getMin("((((()"));

    }

}
