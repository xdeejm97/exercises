package codewars;

public class Duplicate {


    public static void main(String[] args) {

        System.out.println(encode("Success"));


    }

    static String encode(String word) {

        StringBuilder wordChanged = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {

            int c = 0;

            for (int j = 0; j < word.length(); j++) {

                if (word.toLowerCase().charAt(i) == word.toLowerCase().charAt(j)) {
                    word.charAt(i);
                    word.charAt(j);
                    c++;
                }
            }
            if (c <= 1) {
                wordChanged.append("(");
            } else {
                wordChanged.append(")");
            }
            c= 0;




        }


        return wordChanged.toString();
    }
}
