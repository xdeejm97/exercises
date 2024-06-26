package codewars;

public class Grasshopper {
    public static void main(String[] args) {
        System.out.println(fakeBin("45385593107843568"));
    }

    public static int summation(int n) {
            if(n <= 1){
                return  1;
            }
        return summation(n-1) + n;
    }
    public static int summationd(int n) {
        return n * (n+1) / 2;
    }
    public static String fakeBin(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]","1");
    }



}
