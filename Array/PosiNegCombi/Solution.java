package Array.PosiNegCombi;

import java.util.Arrays;

public class Solution {

    public static void posNeg(int[] arr){
        int[] pos = new int[arr.length/2];
        int[] neg = new int[arr.length/2];


        int i  = 0;
       int p =0;
       int n=0;

        while(i<arr.length){

            if(arr[ i ]>0){
                pos[ p ]=arr[ i ];
                p++;
            } else{
                neg[ n ]=arr[ i ];
                n++;
            }
            i++;
        }
        p =0;
        n=0;
        int j = 0;

        int[] ans = new int[arr.length];
        while(j<arr.length){

            ans[j]=pos[p];
            j++;
            p++;
            ans[j]=neg[n];
            j++;
            n++;
        }
        System.out.println(Arrays.toString(ans));

    }
    public static void main(String[] args) {

        int[] arr ={1,-1,-2,2,3,-3};
        posNeg(arr);
    }
}
