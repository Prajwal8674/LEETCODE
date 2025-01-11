package Basics.BouncyNumber;
public class Solution {

    public static boolean isBouncy(int number){

        boolean ascending = false;
        boolean decending=false;

        int last =number%10;
        number/=10;


        while (number>0) {

            int secondLast=number%10;
            if(last <secondLast){
                ascending=true;
            }
            if(last > secondLast){
                decending=true;
            }
            last=secondLast;
            number/=10;

        }
        if (ascending&&decending) {
            return true;
        }

        return false;
    }
    public static void main(String[] args) {

        int number = 12123;
        System.out.println(isBouncy(number));
    }
}
