import java.util.Scanner;

public class RunOLenghtInterview {
    public static String StringChallenge(String str) {
        // code goes here
        char[] charArrayOfStr = str.toCharArray();
        char compareChar = charArrayOfStr[0];
        StringBuilder sb = new StringBuilder();

        int currentIndex = 0;
        int counter = 0;
        for (char c : charArrayOfStr) {
            if (c == compareChar) {
                currentIndex++;
                counter++;
                if (currentIndex > charArrayOfStr.length) {
                    sb.append(Integer.toString(counter)).append(compareChar);

                }
            } else {
                sb.append(Integer.toString(counter) + compareChar);
                counter = 1;
                compareChar = c;

            }
        }


        return sb.toString();
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(StringChallenge(s.nextLine()));
    }

}
    
    

