package String.ToLowerCase;

public class Solution {

    public static String toLowerCase(String str) {

        String ans=" ";
        char ch = str.charAt(i);
        for( int i = 0; i< str.length() ;i++){
            if(str.charAt(i)>='A' &&str.charAt(i)<='Z'){

                ch = (char)(ch+32);
            }
            ans+=ch;
        }
        return  ans;
    }

    public static void main(String[] args) {

        String str = "Hello";
        System.out.println(toLowerCase(str));
    }
}
