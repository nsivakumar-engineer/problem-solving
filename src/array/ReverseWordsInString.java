package array;

public class ReverseWordsInString {
    private static String reverseString(String str) {

        StringBuilder reveredStr = new StringBuilder(); //O(n) space
        int end = str.length();
        for(int start= str.length() - 1; start >=0; start--){ //O(n) time
            if(start == 0 || str.charAt(start-1) == ' ') {
                if(start == 0) { // Dealing with Caps at the start of the sentence
                    reveredStr.append(Character.toLowerCase(str.charAt(0)));
                    if(end > 1) {
                        reveredStr.append(str.substring(start+1, end));
                    }
                    reveredStr.append("."); // Adding a fullstop at the end of the newly reversed sentence
                } else if (end == str.length()) {
                  reveredStr.append(Character.toUpperCase(str.charAt(start))); // Making the first letter of reversed string caps
                  reveredStr.append(str.substring(start+1, end));
                } else {
                    reveredStr.append(str.substring(start, end));
                }
                if (reveredStr.length() != 0) {
                    reveredStr.append(" ");
                }
            } else if(str.charAt(start) == ' ') { // Do not manipulate start inside the loop of start. Only manipulate end.
                end = start;
            }
        }
        return reveredStr.toString();
    }

    public static void main(String[] args){
        String str = "I am a river";
        String str2 = "The sky is blue";
        System.out.println(reverseString(str));System.out.println(reverseString(str2));
    }
}
