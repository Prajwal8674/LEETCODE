package Basics.ReverseInteger;

    class Solution {
        public static int reverse(int num) {

            int rev=0;
            while(num!=0){
                int rem=num%10;
                rev=rev*10+rem;
                num=num/10;
            }

            boolean isNegative = false;
            if(num<0){
                isNegative =true;
            }
            return isNegative ?-rev : rev;
        }
    public static void main(String[] args) {
        int x = 920;
        System.out.println(reverse(x));
    }
}