import java.util.Scanner;

class Function {
    int FirstFactorial(int num) {
        if (num <= 1) {
            return 1;
        }

        return num * FirstFactorial(num - 1);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Function function = new Function();
        System.out.println(function.FirstFactorial(scanner.nextInt()));

    }
}