package Loop;

import java.util.Scanner;

public class Examplos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();


        boolean flaga = false;
        int counter = 1;
        for (int i = 0; i < a.length() / 2; i++) {
            if(a.charAt(i) == a.charAt(a.length() - counter)){
                counter++;
                flaga = true;
            }else {
                flaga = false;
                break;
            }
        }
        System.out.println(flaga);
    }
}
