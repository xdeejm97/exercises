package codewars;


import java.util.Arrays;

public class OutlierNum {
    public static void main(String[] args) {

    }

    static int find(int[] integers) {
        int odd = 0;
        int counterO = 0;
        int even = 0;
        int counterE = 0;
        for (int integer : integers) {

            if (integer % 2 == 0){
                counterO++;
            }else {
                odd = integer;
            }
            if(integer % 2 != 0){
                counterE++;
            }else {
                even = integer;
            }
        }
        if(counterO > counterE){
            return odd;
        }else {
            return even;
        }

    }
}
