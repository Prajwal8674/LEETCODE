package Array.HighestOccurance;

import java.util.Arrays;
public class Solution {

    public static void highestOccured(int[] arr){

        int[] arr2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++){
                if(arr[i]==arr[j]){
                    arr2[i]++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        int max=arr2[0];
        for(int i = 0;i<arr2.length;i++){
            if(max<arr2[i]){
                max=arr2[i];
            }
        }
        for (int i = 0;i<arr2.length;i++) {
            if(arr2[i]==max){
                System.out.println("HIGHEST OCCURANCE VALUE : "+arr[i]);break;
            }
        }
        System.out.println("HIGHEST OCCURANCE : "+max);
    }
    public static void main(String[] args) {

        int[] arr = {4,4,2,1,2,2,2,4,3,3,4,4};
        highestOccured(arr);
    }
}
