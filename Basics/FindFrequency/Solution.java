package Basics.FindFrequency;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        int[] arr = {1, 2, 13, 3, 3, 3, 4, 5, 5, 5, 5};

        Arrays.sort(arr);

        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                System.out.println("Number " + arr[i - 1] + ": " + count + " times");
                count = 1; // Reset count for the next number
            }
        }
        System.out.println("Number " + arr[arr.length - 1] + ": " + count + " times");
            }
        }