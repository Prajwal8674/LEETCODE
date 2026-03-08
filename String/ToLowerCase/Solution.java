package String.ToLowerCase;
public class Solution {


    public static String toLowerCase(String str) {

        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);

            if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch | 32);
            }
            ans.append(ch);
        }
        return ans.toString();
    }
    public static void main(String[] args) {

        String str = "Hello";
        System.out.println(toLowerCase(str));
    }
}
