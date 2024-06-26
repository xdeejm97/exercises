package codewars;

public class Triangle {
    public static void main(String[] args) {

        int a = 1;
        int b = 3;
        int c = 2;
        System.out.println(abc(a, b, c));


    }
    public static boolean abc(int a, int b, int c){
        boolean flag = true;
        if((a + b) <= c){
            flag = false;
        } else if ((b + c) <= a) {
            flag = false;
        } else if ((a+c) <= b) {
            
        }
        return flag;
    }
}
