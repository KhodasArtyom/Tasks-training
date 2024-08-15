package leetcode.palindrom;

public class Palindrome {
    public static String[] array = new String[]{"abc","car","ada","racecar","cool"};

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.firstPalindrome(array));

    }

    public String firstPalindrome(String[] array) {
       for(String w: array){
           if(isPalindrome2(w)){
               return w;
           }
       }
        return "";
    }

    ;

    private boolean isPalindromeVar1(String word) {
        StringBuilder sb = new StringBuilder(word);
        String reverseWord = sb.reverse().toString();
        if (word.equals(reverseWord)) {
            return true;
        } else {

            return false;
        }
    }

    private boolean isPalindrome2(String s){
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }

        return true;
    }


}
