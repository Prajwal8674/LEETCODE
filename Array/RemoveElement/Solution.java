package Array.RemoveElement;

import java.util.Arrays;

public class Solution {
    public static int removeElement(int[] nums, int val) {

        int count=0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
                count++;
            }else{
                int[] ans = new int[count];

            }
        }
        return count;
    }
    public static void main(String[] args) {

        int[] nums = {0,1,4,3,2,5,2};
        int val = 2;
        System.out.println(removeElement(nums,val));
    }
}
