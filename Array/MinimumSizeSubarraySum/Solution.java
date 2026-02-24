package Array.MinimumSizeSubarraySum;

public class Solution {


    public static int minSubArraySum(int target, int[] arr){

        int left=0;
        int sum=0;
        int minlength = Integer.MAX_VALUE;

        for(int right = 0; right <arr.length ; right++){
           sum+=arr[right];

           while(sum>=target){
               minlength=Math.min(minlength,right- left +1);
               sum-=arr[right];
               left++;
           }
        }
        return minlength==Integer.MAX_VALUE?0:minlength;
    }
    public static void main(String[] args) {

        int[] arr = {1,1,1,1,1,1,1,1};
        int key = 7;

        System.out.println(minSubArraySum(7,arr));
    }
}
