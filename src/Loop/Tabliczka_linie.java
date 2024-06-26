package Loop;

public class Tabliczka_linie {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("+---+---+---+");
            System.out.print("| " +i);
            for (int j = 2; j <= 3; j++) {
                System.out.print(" | " +j*i);
            }
            System.out.print(" |");
            System.out.println();
        }
        System.out.println("+---+---+---+");


        String number = "123";
        int parsedNumber = Integer.parseInt(number);
        int[] tabNumber = new int[]{parsedNumber};

        for (int newNumber : tabNumber){
            System.out.println(newNumber + " ");

        }
    }
}
