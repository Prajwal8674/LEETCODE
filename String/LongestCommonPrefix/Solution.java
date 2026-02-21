package String.LongestCommonPrefix;

import java.util.Arrays;

public class Solution {

    public static String longestCommonPrefix(String[] str) {

        if (str == null || str.length == 0) {
            return "";
        }

        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        String first = str[0];
        String last = str[str.length - 1];

        int index = 0;

        while (index < first.length() && index < last.length()) {
            if (first.charAt(index) == last.charAt(index)) {
                index++;
            } else {
                break;
            }
        }
        return first.substring(0, index);
    }

    public static void main(String[] args) {

        String[] str = {"flower", "flew","fly"};
        System.out.println(longestCommonPrefix(str));
    }
}