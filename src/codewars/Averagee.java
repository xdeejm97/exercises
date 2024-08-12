package codewars;

public class Averagee {
    public static void main(String[] args) {

    }

    public static double find_average(int[] array){
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return (double)sum/array.length;
    }
}
