package Array.removeDuplicateFromList;
import java.util.HashSet;

public class Solution {

    public static HashSet<Integer> removeDuplicates(int[] arr){
        HashSet<Integer> arr2 = new HashSet<>();

        for (int num : arr){
            arr2.add(num);
        }
        return arr2;
    }

    public static void main(String[] args) {

        int[] arr = {1,1,2,3,6,6};
        System.out.println(removeDuplicates(arr));
    }
}