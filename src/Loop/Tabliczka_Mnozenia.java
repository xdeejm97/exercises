package Loop;

public class Tabliczka_Mnozenia {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.print(i);
            for (int j = 2; j < 11; j++) {
                System.out.format("%4s", i * j);
            }
            System.out.println();
        }
    }
}