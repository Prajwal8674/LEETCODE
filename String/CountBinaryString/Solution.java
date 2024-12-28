package String.CountBinaryString;

public class Solution {
    public static int countBinarySubstrings(String s) {
        int count = 0;
        int prevGroupLength = 0, currGroupLength = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currGroupLength++;
            } else {
                count += Math.min(prevGroupLength, currGroupLength);
                prevGroupLength = currGroupLength;
                currGroupLength = 1;
            }
        }

        // Add the last group comparison
        count += Math.min(prevGroupLength, currGroupLength);

        return count;
    }

    public static void main(String[] args) {
        String s = "00110011";
        System.out.println("Count of binary substrings: " + countBinarySubstrings(s)); // Output: 6
    }
}
