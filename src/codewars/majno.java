package codewars;

public class majno {
    public static void main(String[] args) {
        System.out.println(abc());

    }

    static boolean abc(){
        int x = -121;
        int a = 0;
        int aX = x;

        while(x != 0){

            int ab = x % 10;
            a = 10 * a + ab;
            x/= 10;
        }
        if(a == aX){
            return true;

        }else{
            return false;
        }


    }

}
