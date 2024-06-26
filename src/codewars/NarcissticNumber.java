package codewars;

public class NarcissticNumber {
    public static void main(String[] args) {
        System.out.println(isNarcissistic(153));
    }

    public static boolean isNarcissistic(int number) {
        // TODO replace with your code
        String s = String.valueOf(number);
        char[] a = s.toCharArray();

        int sum = 0;
        for (char c : a){
            sum += (int) Math.pow(Integer.parseInt(String.valueOf(c)), a.length);
        }

        return sum == number;
    }
}
