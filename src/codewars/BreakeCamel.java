package codewars;

public class BreakeCamel {
    public static void main(String[] args) {
        System.out.println(camelCase("abecadloZec"));

    }
    public static String camelCase(String input) {

        return input.replaceAll("([A-Z])", " $1");
    }
}
