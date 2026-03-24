package String.hasSpecialSubstring;

class Solution {
    public static boolean hasSpecialSubstring(String s, int k) {

        for(int i=0;i<=s.length()-k;i++)
        {
            int count = 0;
x
            char ch = s.charAt(i);
            for(int j=i;j<i+k;j++)
            {
                if(s.charAt(j)==ch)
                {
                    count++;
                }
            }
            if(count == k &&
                    (i==0 || s.charAt(i-1)!=ch) &&
                    (i+k == s.length() || s.charAt(i+k) != ch))
            {
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {

        String str = "aaabaaa";
        int k = 3;
        System.out.println(hasSpecialSubstring(str,k));
    }
}
