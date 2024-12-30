package Array.ValidParentheses;

import java.util.Stack;

public class Solution {

    public static boolean isValid(String s) {

        Stack<Character> chars = new Stack<>();

        for(char ch : s.toCharArray()){

            if(ch=='('){
                chars.push(')');
            }
            else if(ch=='['){
                chars.push(']');
            }
            else if(ch=='{'){
                chars.push('}');
            }
            else if(chars.isEmpty() || chars.pop()!=ch){
                return false;
            }
        }
        return chars.isEmpty();
    }

    public static void main(String[] args) {

        String str = "()";
        System.out.println(isValid(str));
    }
}
