package Array.PlusOne;
import java.util.Arrays;

public class Solution {

    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if(digits[0]==0){
            int[] newArr = new int[digits.length+1];
            newArr[0]=1;
            return newArr;
        }
        return digits;
    }

    public static void main(String[] args) {

        int[] arr = {9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }

}