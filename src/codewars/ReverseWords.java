package codewars;

public class ReverseWords {
    public static void main(String[] args) {

        System.out.println(reverseWords("The quick brown fox jumps over the lazy dog."));
    }public static String reverseWords(final String original)
    {
        // Have at it

        String[] array = original.split(" ");
        int i = 0;
        for(String s : array){
            array[i] = new StringBuilder(s).reverse().toString();
            i++;
        }
        return String.join(" ", array);
    }
}
