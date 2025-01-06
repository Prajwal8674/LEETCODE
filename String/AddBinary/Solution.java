package String.AddBinary;

public class Solution {
    public static String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int carry = 0;

        // Ensure strings are of equal length by padding the shorter one with leading zeros
        while (a.length() < b.length()) {
            a = "0" + a;
        }
        while (b.length() < a.length()) {
            b = "0" + b;
        }

        // Perform binary addition from right to left
        for (int i = a.length() - 1; i >= 0; i--) {
            int A = a.charAt(i) - '0';
            int B = b.charAt(i) - '0';

            int sum = A + B + carry;
            ans.append(sum % 2); // Append the current bit
            carry = sum / 2; // Update carry
        }

        // If there's a leftover carry, append it
        if (carry > 0) {
            ans.append(carry);
        }

        return ans.reverse().toString(); // Reverse the result
    }

    public static void main(String[] args) {
        String str1 = "11";
        String str2 = "01";

        System.out.println(addBinary(str1, str2)); // Directly call addBinary
    }
}
