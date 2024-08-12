package codewars;

public class Divisiors {
    public static void main(String[] args) {


    }

    public long numberOfDivisors(int n) {
        // TODO please write your code below this comment
        long c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        return c;
    }
}
