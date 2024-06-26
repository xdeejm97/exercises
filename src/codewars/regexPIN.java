package codewars;

import java.util.regex.Matcher;

public class regexPIN {
    public static void main(String[] args) {

        String pin = "1234";

        if(pin.matches("\\d{4}|\\d{6}")){
            System.out.printf(pin);
        }


    }
}
