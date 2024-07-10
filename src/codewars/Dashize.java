package codewars;

public class Dashize {
    public static void main(String[] args) {
        System.out.println(nbYear(1000, 5, 100, 5000));
    }

    public static String dashatize(int num) {
        String[] array = String.valueOf(num).split("");

        return String.join("-", array);
    }

    public static int nbYear(int p0, double percent, int aug, int p) {
        int counter = 0;
        int res = p0;
        while (res <= p) {

            res += (int) (res * (percent / 100)) + aug;
            counter++;
        }
        return counter;
    }
}
