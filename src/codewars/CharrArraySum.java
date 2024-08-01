package codewars;

public class CharrArraySum {
    public static void main(String[] args) {
        System.out.println(findMissingLetter(new char[]{'a','b','c','d','f'}));

    }

    public static char findMissingLetter(char[] array)
    {
        char e = array[0];
        for (char c : array){
            if(c != e)break;
            e++;
        }
        return e;
    }
}
