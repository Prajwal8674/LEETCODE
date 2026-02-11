package Array.RemoveDuplicate;
import java.util.Arrays;


public class Solution {

    public static int[] uniqueElements(int[] arr, int count){

        int[] uniqueArray = new int[count];

        for(int i = 0 , j=0; i < arr.length;i++){

            if(arr[i]!=-1){
                uniqueArray[j]=arr[i];
                j++;
            }
        }
        return uniqueArray;
    }
    public static void countUnique(int[] arr){

        int count = 0 ;
        int count2 = 0;

        for(int i=0; i<arr.length ; i++){

            for(int j=i+1; j<arr.length ; j++){
                if(arr[i]==arr[j]){
                    arr[j]=-1;
                }
            }
            if(arr[i]>=0){
                count++;
            }
            if(arr[i]<0){
                count2++;
            }
        }
        System.out.println(Arrays.toString(uniqueElements(arr,count)));
    }
    public static void main(String[] args) {

        int[] arr = {1,1,2,3,3};

        countUnique(arr);

    }
}
