package array;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

public class Palindrome {

    private static boolean isPalindrome(String str) {
        int start = 0, end = str.length() - 1;
        while(start < end) {
            Character startChar = Character.toLowerCase(str.charAt(start));
            Character endChar = Character.toLowerCase(str.charAt(end));
            if(startChar == endChar) {
                start++;
                end--;
            } else if(!Character.isLetterOrDigit(startChar)) {
                start++;
            } else if(!Character.isLetterOrDigit(endChar)){
                end--;
            } else {
                return false;
            }
        }
        if(start + 1 == end || start == end) {
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        String input = "I am made damm ai";
        String input2 = "madam";
        String input3 = "A man, a plan, a canal: Panama";
        String input4 = "race a car";
        System.out.println(isPalindrome(input));
        System.out.println(isPalindrome(input2));System.out.println(isPalindrome(input3));System.out.println(isPalindrome(input4  ));

    }
}
