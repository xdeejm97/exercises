package codewars;

public class CharrArraySum {
    public static void main(String[] args) {
        System.out.println(findMissingLetter(new char[]{'a','b','c','d','f'}));
        System.out.println(findMissingLetter("abecadlo"));
        System.out.println(findMissingLetters("kajaks", "kajaka"));
    }
    public static String findMissingLetter(String word)
    {
        StringBuilder sb = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++) {

            if(!word.contains(String.valueOf(c))){
                sb.append(c);
            }

        }
        return sb.toString();

    }
    public static boolean findMissingLetters(String s, String t)
    {
        byte[] lettersNumber = new byte[26];

        for(int i = 0; i < s.length(); i++){

            lettersNumber[s.charAt(i) - 97]++;
            lettersNumber[t.charAt(i) - 97]--;
        }
        for(int a : lettersNumber){

            if(a != 0){return false;}

    }
        return true;

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
