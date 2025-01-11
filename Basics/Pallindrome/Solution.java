package Basics.Pallindrome;

public class Solution {
    public static boolean isPallindrome(int num){

        int temp = num;
        int rev=0;
        int den=0;

        if(num>0){
            for(;temp>0;temp/=10){

                den = temp%10;
                rev=rev*10+den;
            }
        }
        if(rev==num){
            return true;
        }
        System.out.println(rev);
        return false;
    }
    public static void main(String[] args) {

        int num = 121;
        System.out.println(isPallindrome(num));
    }
}
