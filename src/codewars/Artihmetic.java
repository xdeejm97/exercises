package codewars;

public class Artihmetic {
    public static void main(String[] args) {


    }

    public static int arithmetic(int a, int b, String operator) {
        // your code here

        switch (operator) {
            case "add" -> {
                return a + b;
            }
            case "subtract" -> {
                return a - b;
            }
            case "multiply" -> {
                return a * b;
            }
            case "divide" -> {
                return a / b;
            }
        }
        return 0;

    }
}
