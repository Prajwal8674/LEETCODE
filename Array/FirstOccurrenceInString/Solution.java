package Array.FirstOccurrenceInString;

public class Solution {

    public static int strStr(String haystack, String needle) {

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j;
            for (j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        String haystack = "bhaasadsadd";
        String needle = "sad";

        System.out.println(strStr(haystack,needle));
    }
}
