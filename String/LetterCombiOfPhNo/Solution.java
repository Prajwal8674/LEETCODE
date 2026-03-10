package String.LetterCombiOfPhNo;

import java.util.*;

class Solution {

    static String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
    };


    public static List<String> letterCombinations(String digits) {


        List<String> result = new ArrayList<>();

        if(digits.length() == 0)
            return result;

        backtrack(digits, 0, new StringBuilder(), result);

        return result;
    }


    public static void backtrack(String digits, int index, StringBuilder current, List<String> result){

        if(index == digits.length()){
            result.add(current.toString());
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for(char c : letters.toCharArray()){

            current.append(c);        // choose

            backtrack(digits, index+1, current, result);  // explore

            current.deleteCharAt(current.length()-1); // undo (backtrack)
        }
    }

    public static void main(String[] args) {
        String str = "23";
        List<String> ans = letterCombinations(str);
        System.out.println(ans);
    }
}