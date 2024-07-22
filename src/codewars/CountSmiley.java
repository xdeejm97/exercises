package codewars;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountSmiley {
    public static void main(String[] args) {
        System.out.println(countSmileys(List.of(":)", ":D", ";-D", ":~)")));
    }
    public static int countSmileys(List<String> arr) {
        // Just Smile :)
        int counter = 0;
        Set<String> array = new HashSet<>();
        array.add(":)");
        array.add(";)");
        array.add(":D");
        array.add(";D");
        array.add(";-D");
        array.add(":-D");
        array.add(":~)");
        array.add(";~)");
        array.add(":~D");
        array.add(";~D");
        array.add(";-)");
        array.add(":-)");


        for (String s : arr){

            if(array.contains(s)){
                counter++;
            }
        }

        return counter;
    }
}
