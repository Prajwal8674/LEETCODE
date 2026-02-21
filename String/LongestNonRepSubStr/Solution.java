package String.LongestNonRepSubStr;

import java.util.HashSet;

public class Solution {
        public static int lengthOfLongestSubstring(String s) {
            int left = 0;
            int maxLength = 0;

            HashSet<Character> charSet = new HashSet<>();

            for(int right = 0; right<s.length();right++){

                while (charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            }
            return maxLength;
        }

    public static void main(String[] args) {

        String str="abcabcbb";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
