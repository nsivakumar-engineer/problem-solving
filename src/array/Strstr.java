package array;

public class Strstr {
    private static int count = 0;

    private static int strstr(String str, String substr) {
        int strStartPos = 0, strEndPos = 0, substrPos = 0;
        count = 0;
        while(substrPos < substr.length() && strEndPos < str.length()) {
            count++;
            if(substr.charAt(substrPos) == str.charAt(strEndPos)) {
                strEndPos++;
                substrPos++;
            } else {
                substrPos = 0;
                strStartPos = strEndPos + 1;
                strEndPos = strStartPos;
            }
        }

        return (substrPos == substr.length() ? strStartPos : -1);
    }

    public static void main(String[] args){
        String str = "mississippi";
        String substr = "issi";
        String str1 = "aaaba";
        String substr1 = "ba";
        String str2 = "aaaaaaaaaaaaaaaaaa";
        String substr2 = "aaaaaaaaaaaaaaaaab";
        System.out.println(strstr(str, substr)); System.out.println(strstr(str1, substr1)); System.out.println(strstr(str2, substr2));
        System.out.println(count);
    }
}
