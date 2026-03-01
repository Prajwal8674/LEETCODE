package Basics.powerOfThree;

//O(1)
//class Solution {
//    public boolean isPowerOfThree(int n) {
//        return n > 0 && 1162261467 % n == 0;
//    }
//}



class Solution {
    public static boolean isPowerOfThree(int n) {

        if (n <= 0) return false;

        while (n % 3 == 0) {
            n = n / 3;
        }

        return n == 1;
    }
    public static void main(String[] args)
    {
        int num = -1;
        System.out.println(isPowerOfThree(num));

    }
}