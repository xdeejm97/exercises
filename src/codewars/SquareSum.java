package codewars;

public class SquareSum {
    public static void main(String[] args) {

        int[] ns = new int[]{1,2,3,4};

        int a = 0;
        for (int i = 0; i < ns.length; i++) {
            a = (int) (a + Math.sqrt(ns[i]));
            System.out.print(ns[i]);

        }
        System.out.print(a);


    }
}
