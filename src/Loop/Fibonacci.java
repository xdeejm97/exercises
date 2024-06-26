package Loop;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int index = 1;
        int resulofFibo = 1;
        int result = 0;
        do {

            resulofFibo += result;
            result = resulofFibo - result;

            index++;
        }while (index < number);
        System.out.println(resulofFibo);


    }
}
