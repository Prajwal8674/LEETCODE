package Basics.ArmstrongNumber;

public class Solution {

    private static int countDigits(int num) {
        int temp=num;
        int count=0;

        while(temp>0){
            temp/=10;
            count++;
        }
        System.out.println(count*count);
        return count;
    }
    private static boolean isArmstrong(int num) {

        int temp= num;
        int count = countDigits(num);
        System.out.println(count);
        System.out.println(num);

        int ans=0;
        int mul;

        while(temp>0){
            int rem = temp%10;
            mul=1;
            for( int i = 1 ; i <= count ; i++){
                mul*=rem;
            }
            ans+=mul;
            temp/=10;
        }
       if(ans==num){

           return true;
       }
        return false;
    }

    public static void main(String[] args) {

        int num = 92727;
        System.out.println(isArmstrong(num));
    }




}
