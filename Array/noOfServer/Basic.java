package Array.noOfServer;

public class Basic {

    private static int noOfServer(int[] arr,int value){
        int count = 1;
        int add = 0 ;

        for(int i = arr.length-1 ; i >= 0 ; i--){

            if(arr[i]>=0){
                add+=arr[i];
                if(add!=value){
                    count++;
                }
            }
            if(add==value){
                return count;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int[] arr = {1,1,0,4,4};
        int value = 8;
        System.out.println(noOfServer(arr,value));

    }
}