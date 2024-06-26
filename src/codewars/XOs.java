package codewars;

public class XOs {
    public static void main(String[] args) {
        System.out.println(getXO("ooxx"));
    }

    public static boolean getXO (String str) {

        // Good Luck!!
        int x= 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.toLowerCase().charAt(i) == 'x')x++;
            if(str.toLowerCase().charAt(i) == 'o')x--;
            
        }
        return x == 0;
    }
}
