package Loop;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Silnia {
    int Factorial(int fact){
        if(fact <= 1){
            return 1;
        }

        return fact * Factorial(fact - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Silnia silnia = new Silnia();
        int scannerInt = s.nextInt();
        System.out.println(scannerInt + "! = " + silnia.Factorial(scannerInt));
    }


}
