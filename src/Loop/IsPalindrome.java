package Loop;

import java.util.Scanner;

public class IsPalindrome {

    boolean checkPalindrome(String str) {
        boolean check = false;
        int counter = 1;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - counter)) {
                counter++;
                check = true;
            }else {
                counter++;
                check = false;
            }
        }
        return check;
    }

    public static void main(String[] args) {

        IsPalindrome isPalindrome = new IsPalindrome();
        Scanner s = new Scanner(System.in);
        System.out.println(isPalindrome.checkPalindrome(s.nextLine()));

    }
}
