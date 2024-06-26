package codewars;

import java.util.Arrays;

public class SmashWords {
    public static void main(String[] args) {
        System.out.println(smash(new String[] { "hello", "world"}));
    }
    public static String smash(String... words) {
        // TODO Write your code below this comment please
        return String.join(" ", words);
    }
}
