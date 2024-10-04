package example;

public class CharacterMain {
    public static void main(String[] args) {
        String s = "sbdfa";

        StringBuilder sb = new StringBuilder();

        for (char c = 'a'; c < 'z' - 1; c++) {

            if (!s.contains(String.valueOf(c))){
                sb.append(c);
            }
        }
        System.out.println(sb.toString());

    }
}
