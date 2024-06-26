package codewars;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Stream;

public class ProgramChceckerPanagram {
    public static void main(String[] args) {
        System.out.println(check("The quick brown fox jumps over the lazy dog.a"));

    }
    public static boolean check(String sentence){

        long res = sentence.toLowerCase().chars().filter(i -> i >= 'a' && i <= 'z').distinct().count();

        return res == 26;
    }
}
