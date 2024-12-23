package Array.MedianOfTwoArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void merge(int[] arr1,int[] arr2){
        int[] arr = new int[arr1.length+arr2.length];
        int index = 0;

        for(int data : arr1){
            arr[index]=data;
            index++;
        }
        for(int data : arr2){
            arr[index]=data;
            index++;
        }
        Arrays.sort(arr);
        double average;
        double median;

        if(arr.length%2!=0){
            median = Array.getInt(arr,(arr.length/2));
        }else{
            int mid= arr.length/2;
            int mid2 = (arr.length/2)-1;
            average = (Array.getDouble(arr,mid)+Array.getInt(arr,mid2))/2;
            median= average;
        }
        System.out.println("SORTED ARRAY : "+Arrays.toString(arr));
        System.out.println("MEDIAN : "+median);

    }
    public static void main(String[] args) {

        int[] arr1 = {1,3,8,5};
        int[] arr2 = {2,6,4,7};

        merge(arr1,arr2);
    }
}
