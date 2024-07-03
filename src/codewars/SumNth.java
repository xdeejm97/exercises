package codewars;

public class SumNth {
    public static void main(String[] args) {
        System.out.println(seriesSum(1));
        System.out.println(1/7.0);
    }
    public static String seriesSum(int n) {
        // Happy Coding ^_^

        double res = 0.0;

        for (int i = 0; i < n; i++) {
            res += 1.0 / (1 + 3 * i);


        }

        return String.format("%.2f", res);
    }
}
