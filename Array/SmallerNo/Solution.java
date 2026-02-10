package Array.SmallerNo;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void answer(int arr[]){

        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);

        System.out.print("Pick a Number : ");
        int num = sc.nextInt();
        int count = 0;

        for(int i = 0 ; i < arr.length ; i++){
            if(num > arr[i]){
                count++;
            }
        }
        int[] lesserNo = new int[count];

        int i =0 ;
        int index=0;
        while(i < arr.length){
            if(arr[i]<num){
                lesserNo[index]=arr[i];
                index++;
            }
            i++;
        }
        System.out.println(count);
        System.out.println(Arrays.toString(lesserNo));

    }
    public static void main(String[] args) {

        int[] arr = {1,4,2,8,3,4,7,8,9,10,44,54,8,21,66,554,213,9,1};
        answer(arr);
    }
}
