package Loop;

import java.util.Scanner;

public class RecursiveFibonacci {

    static int fibonacci(int number){
        if (number < 1){
            return 1;
        }
        return fibonacci(number - 1)+fibonacci(number - 2);
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci(i));

        }
    }
}
