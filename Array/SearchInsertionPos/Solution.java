package Array.SearchInsertionPos;

public class Solution {

    static public int searchInsert(int[] arr, int key) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (key == arr[mid]) {
                return mid;
            }
            else if (key > arr[mid]) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 5, 8, 9};
        int key = 6;
        System.out.println(searchInsert(arr, key));
    }
}