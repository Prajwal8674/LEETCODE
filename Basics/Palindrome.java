package Basics;

public class Palindrome {

    public static boolean isPalindrome(int num){


        int temp=num;
        int reverse=0;
        int rem=0;

        if(temp==0){
            return true;
        }
        if(temp>0){
            for(int i = 0 ; temp!=0 ; i++){
                rem = temp % 10;
                reverse = reverse*10+rem;
                temp = temp/10;
            }
            if(reverse==num){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int num = 0;
        System.out.println(isPalindrome(num));
    }
}
