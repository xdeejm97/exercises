package codewars;

public class isPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }

    public static boolean isPrime(int num) {

        if(num < 2){
            return false;//TODO
        }

        for (int i = 2; i < Math.sqrt(num); i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}

