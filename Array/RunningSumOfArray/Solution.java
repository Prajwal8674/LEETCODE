package Array.RunningSumOfArray;

import java.util.Arrays;

public class Solution {

    public static int[] runningSum(int[] arr) {

        int i = 0;
        int sum=1;
        while(i< arr.length-1){
            arr[sum]=arr[i]+arr[sum];
            i++;
            sum++;
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
       System.out.println(Arrays.toString(runningSum(arr)));
    }
}
