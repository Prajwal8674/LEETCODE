package String.ReverseStringSpChar;
public class Solution {

    private static String specialRev(String str){

        char[] ch1 = str.toCharArray();
        char[] ch2 = new char[ch1.length];

        for( int i = 0; i < ch1.length ; i++){
            if (ch1[i] < 'a' || ch1[i] > 'z') {
                ch2[i] = ch1[i];
            }
        }
        int j = ch1.length - 1;
        for (int i = 0; i < ch1.length; i++) {
            if (ch2[i] == '\0' && ch1[i] >= 'a' && ch1[i] <= 'z') {

                if (ch2[j] != '\0' && (ch2[j] < 'a' || ch2[j] > 'z')) {
                    j--;
                }
                ch2[i] = ch1[j];
                j--;
            }
        }
        System.out.println("old : "+str);
        return new String(ch2);
    }
    public static void main(String[] args) {

        String str = "he@ll#o";
        System.out.println("new :"+specialRev(str));
        System.gc();

    }
}
