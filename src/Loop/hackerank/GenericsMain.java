package Loop.hackerank;

import java.util.ArrayList;
import java.util.List;

public class GenericsMain {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        List<String> b = new ArrayList<>();

        b.add("Hello");
        b.add("World");


        printArray(a);
        printArray(b);




    }

    public static void printArray(List<?> t){

        for (int i = 0; i < t.size(); i++) {
            System.out.println(t.get(i));
        }


    }
}
