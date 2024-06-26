package codewars;

public class PerfectSquare {
    public static void main(String[] args) {

    }
    public static long findNextSquare(long sq) {
        long sqrt = (long) Math.sqrt(sq);
        if((sqrt * sqrt) == sq){

            return (long) Math.pow(++sqrt, 2);

        }else{
            return -1;
        }
    }
}
