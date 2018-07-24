package array;

//Reverse words in place - no additional memory
public class ReverseWordsInStringII {
    private static String reverseString(String str) {
        return reverseStringHelper(str.toCharArray());
    }

    private static String reverseStringHelper(char[] str){
        // Reverse the entire string
        reverse(str, 0, str.length);
        System.out.println(str);
        // Reverse each word
        for(int i=0, j=0; j<= str.length; j++) {
            if(j == str.length || str[j] == ' ') {//Either end of whole sentence or end of each word
                reverse(str, i, j);
                if(j == str.length) { // Removing Capital letter at the start of sentence if any
                    str[i] = Character.toLowerCase(str[i]);
                }
                i = j + 1; // J is the running index of the loop. I needs to be reset after dealing with each word
            }
        }

        return new String(str);
    }

    private static void reverse(char[] str, int start, int end){
        for(int i=0; i< (end - start)/2; i++){ // till the middle of the loop swap both the corresponding ends
            char temp = str[start + i];
            str[start + i] = str[end - i - 1];
            str[end - i - 1] = temp;
        }
    }
    public static void main(String[] args){
        String str = "I am a river";
        String str2 = "The sky is blue";
        System.out.println(reverseString(str));System.out.println(reverseString(str2));
    }
}
