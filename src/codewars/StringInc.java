package codewars;

import java.util.Arrays;

public class StringInc {
    public static void main(String[] args) {

        System.out.println(incrementString("foo123"));



    }

    public static String incrementString(String str) {


        String[] splits = str.split("\\d");

        String[] digitLast = str.split("\\D");

        long s = Long.parseLong(digitLast[digitLast.length - 1]);

        StringBuilder res = new StringBuilder();

        for (String words : splits){
            res.append(words);
        }

        return res.toString() + ++s;
    }

}
