package Array.SearchInsertionPosition;

import java.util.ArrayList;

class Solution {
    public static int searchInsert(ArrayList<Integer> arr, int key) {
        int start = 0;
        int end = arr.size() - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (key == arr.get(mid)) {
                return mid;
            } else if (key > arr.get(mid)) {

                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        int key = 6;
        System.out.println(searchInsert(arr, key));
    }
}
