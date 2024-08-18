package neetcode;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abc?"));
    }

    public static boolean isPalindrome(String s) {

        int l = 0;
        int r = s.length() - 1;

        while (l < r){

            while (l < r && !Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++;
            r--;

        }

        return true;

    }
}
