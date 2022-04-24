package single_week290;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1 {

    public static List<Integer> intersection(int[][] nums) {
        Arrays.sort(nums[0]);
        if (nums.length == 1) {
            ArrayList<Integer> result = new ArrayList<>();
            for (int i : nums[0]) {
                result.add(i);
            }
            return result;
        }


        int[] temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (temp.length == 0 || nums[i].length == 0) {
                return new ArrayList<>();
            }
            Arrays.sort(nums[i]);

            if (temp[0]> nums[i][nums[i].length-1] || temp[temp.length-1]<nums[i][0]){
                return new ArrayList<>();
            }
            temp=merge(temp,nums[i]);
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int i : temp) {
            result.add(i);
        }
        return result;


    }

    private static int[] merge(int[] temp, int[] num) {
        List<Integer> result=new ArrayList<>();
        int i=0;
        int j=0;
       while (i< temp.length && j <num.length){
           if(temp[i]>num[j]){
               j++;
           }else if (temp[i]< num[j]){
               i++;
           }else{
               result.add(temp[i]);
               i++;
               j++;
           }
       }

        int[] rr = new int[result.size()];
        for (int m = 0; m < result.size(); m++) {
            rr[m]=result.get(m);
        }
       return rr;



    }

    public static void main(String[] args) {
        int[][] aa = new int[][]{new int[]{3, 1, 2, 4, 5}, new int[]{1, 2, 3, 4}, new int[]{3, 4, 5, 6}};
        System.out.println(intersection(aa));
    }
}
