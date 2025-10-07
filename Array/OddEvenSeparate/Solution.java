package Array.OddEvenSeparate;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public static void sepratedArr2(int[] arr) {

        int oddCount=0;
        int evenCount=0;

        for (int i = 0 ; i < arr.length ; i++){

            if(arr[i]%2==0){
                evenCount++;
            }else {
                oddCount++;
            }
        }
        int[] evenArr=new int[evenCount];
        int[] oddArr=new int[oddCount];

        int i = 0 ;
        int eveIndex =0;
        int oddIndex =0;

        while(i < arr.length){
            if(arr[i]%2==0){
                evenArr[eveIndex]=arr[i];
                eveIndex++;
            }
            else{
                oddArr[oddIndex]=arr[i];
                oddIndex++;
            }
            i++;
        }
        System.out.println(Arrays.toString(evenArr));
        System.out.println(Arrays.toString(oddArr));

    }
    public static void sepratedArr(int[] arr){

        int evenCount =0;
        int oddCount =0;

        ArrayList<Integer> even= new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();


        for(int i = 0 ; i < arr.length ; i++){

            if(arr[i]%2==0){
                even.add(arr[i]);
            }
            else{

               odd.add(arr[i]) ;
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
        sepratedArr(arr);
        sepratedArr2(arr);

    }
}
