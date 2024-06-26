package codewars;

public class Vowels {
    public static void main(String[] args) {
        System.out.println(disemvowel("This website is for losers LOL"));

    }

    public static String disemvowel(String str) {
        // Code away...

        //a e i o u

        return str.replaceAll("[aeiouAEIOU]", "");
    }

}
