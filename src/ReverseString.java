import java.util.Scanner;

public class ReverseString {
    String methodOfReverse(String str){
        String addLetter = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            addLetter += str.charAt(i);
        }

        return addLetter.toLowerCase();
    }

    String secondMethodOfReverse(String str2){
        return new StringBuilder(str2).reverse().toString();

    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ReverseString reverseString = new ReverseString();
        ReverseString reverseString2 = new ReverseString();
        ReverseString reverseString3 = new ReverseString();
        String s1 = s.nextLine();
        System.out.println(reverseString.methodOfReverse(s1));
        System.out.println("---------------------");
   //     System.out.println(reverseString2.secondMethodOfReverse(s1));
       // System.out.println(reverseString3.secondMethodOfReverse(s.nextLine()));
    }
}
