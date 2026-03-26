package String.firstPalindrome;

public class Solution {

    public static boolean isPallindrome(String word){

        int i = 0, j = word.length()-1;
        while(i<j){
            if(word.charAt(i++)!=word.charAt(j--)){
                return false;
            }
        }
        return true;
    }
    public static String firstPalindrome(String[] words) {

        for(String w : words){
           if( isPallindrome(w)){
               return w;
           }
        }
        return "";
    }

    public static void main(String[] args) {

        String[] words = {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(words) );
    }
}
