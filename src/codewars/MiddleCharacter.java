package codewars;

public class MiddleCharacter {
    public static void main(String[] args) {
        System.out.println(getMiddle("jedena"));
        String a = "abcdefg";
        StringBuilder sb = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++) {

            if (!a.contains(String.valueOf(c))){
                sb.append(c);
            }
        }
        System.out.println(sb.toString());

    }
    public static String getMiddle(String word) {
        //Code goes here!
        if (word.length() % 2 == 0){
            return word.substring((word.length() / 2) - 1, (word.length()/2 + 1));
        }else {
            return word.substring(word.length() / 2, (word.length()/2 + 1));
        }
    }
}
