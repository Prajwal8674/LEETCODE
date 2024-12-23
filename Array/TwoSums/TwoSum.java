package Array.TwoSums;

import java.util.Arrays;

public class TwoSum {


    public static int[] twoSum(int[] arr, int target){

        int[] ans = new int[2];

        for(int i = 0 ; i < arr.length; i++){

            for(int j = 1 ; j< arr.length; j++){

                if(arr[i]+arr[j]==target && i!=j){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        int[] arr = {3,3};
        System.out.println(Arrays.toString(twoSum(arr, 6)));

    }
}
