package String.RotateString;

public class Solution {

    public static  boolean rotateString(String str, String goal) {

        String s1 = str+str;

        if(str.length()!=goal.length()){
            return false;
        }
        if(s1.contains(goal)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "abcde";
        String goal = "abced";
        System.out.println(rotateString(str, goal));
    }
}
