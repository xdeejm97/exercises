package codewars;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WhichAreIn {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(inArray(new String[]{"arp", "live", "strong"}, new String[]{"lively", "alive", "harp", "sharp", "armstrong"})));


    }
    public static String[] inArray(String[] array1, String[] array2) {


        String[] r = new String[array1.length];

        Set<String> ra = new HashSet<>();

        for (int i = 0; i < array1.length; i++) {

            if(array2[i].contains(array1[i])){
                r[i] = array1[i];
            }
            ra.add(array2[i]);


        }


        return r;
    }

}
