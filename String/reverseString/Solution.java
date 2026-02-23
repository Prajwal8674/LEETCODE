package String.reverseString;

import java.util.Arrays;

public class Solution {



        public static void reverseString(char[] s) {

            int left = 0;
            int right = s.length-1;

            while(left<right){
               char temp=s[right];
                s[right]=s[left];
                s[left]=temp;
                left++;right--;
            }
            System.out.println(Arrays.toString(s));

        }

    public static void main(String[] args) {

        char[] s = {'H','a','n','n','a','h'};
        reverseString(s);
    }
}
