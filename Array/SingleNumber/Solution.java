package Array.SingleNumber;

class Solution {
    public static int singleNumber(int[] nums) {
        int ans =0;

        int len = nums.length;

        for(int i=0 ; i!=len; i++){

            ans ^= nums[i];
        }
        return ans;

    }
    public static void main(String[] args){

        int[] arr={4,2,4};
        System.out.println(singleNumber(arr));

    }
}