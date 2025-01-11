package Array.HalfOddHalfEven;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        // Two-pointer approach
        int left = 0; // Start pointer
        int right = arr.length - 1; // End pointer

        while (left < right) {
            // Move the left pointer until an even number is found
            while (left < right && arr[left] % 2 != 0) {
                left++;
            }
            // Move the right pointer until an odd number is found
            while (left < right && arr[right] % 2 == 0) {
                right--;
            }
            // Swap the even number at 'left' with the odd number at 'right'
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
