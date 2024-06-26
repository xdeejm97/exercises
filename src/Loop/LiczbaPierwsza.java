package Loop;

import java.util.Scanner;

public class LiczbaPierwsza {

    public static boolean isPrimeNumber(int numerbTested){
        for (int i = 2; i <= numerbTested / 2; i++) {
            if(numerbTested % i == 0){
                return false;
            }
        }return true;
    }

    public static void main(String[] args) {

        LiczbaPierwsza testedMethod = new LiczbaPierwsza();
        System.out.println(testedMethod.isPrimeNumber(4));

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number <= 1){
            System.out.println("To nie jest liczba pierwsza");
        }

        boolean isPrime = true;
        for (int i = 2; i <= number/2; i++) {
            if(number % i == 0){
                isPrime = false;
            }
        }

        if(isPrime){
            System.out.println("Liczba pierwsza");
        }else {
            System.out.println("To nie jest liczba pierwsza");
        }
    }
}
