package Array.RomanToInteger;
import java.util.HashMap;

public class Solution {

        public static int romanToInt(String romanValue) {

            HashMap<Character, Integer> arr = new HashMap();
            arr.put('I',1);
            arr.put('V',5);
            arr.put('X',10);
            arr.put('L',50);
            arr.put('C',100);
            arr.put('D',500);
            arr.put('M',1000);

            int result=0;
            int prev=0;
            for(int i = romanValue.length()-1; i>=0 ; i--){

                char key = romanValue.charAt(i);
                int value = arr.get(key);

                if(value < prev){
                    result=result-value;
                }else{
                    result=result+value;
                }
                prev = value;
            }
            return result;
        }
        public static void main(String[] args){

            String romanValue = "v";
            System.out.println(romanToInt(romanValue.toUpperCase()));
        }
    }

