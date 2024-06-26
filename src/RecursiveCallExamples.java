import java.util.Scanner;

public class RecursiveCallExamples {

    String stringDivided(String str){

        if(str.length() <= 1){
            return str;
        }else {
            System.out.println(str);
            int midIndex = (int) Math.floor(str.length() / 2);

            return stringDivided(str.substring(0, midIndex));
        }


    }

    public static void main(String[] args) {
        RecursiveCallExamples recursiveCallExamples = new RecursiveCallExamples();
        Scanner s = new Scanner(System.in);
        System.out.println(recursiveCallExamples.stringDivided(s.nextLine()));
    }
}
