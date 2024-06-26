package codewars;

public class Centruy {
    public static void main(String[] args) {
        System.out.println(century(1705));
    }

    public static int century(int number) {
        return (number + 99) / 100 ;
    }

}
