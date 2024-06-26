import java.util.Scanner;

public class RunOLenghtSolutions {
    String FunctionAlgo(String str){

        char[] primaryArray = str.toCharArray();
        char secondaryArray = primaryArray[0];
        StringBuilder sb = new StringBuilder();


        int index = 0;
        int counter = 0;

        for (char c : primaryArray){
            if(c == secondaryArray){
                index++;
                counter++;
                if (index + 1 < primaryArray.length) {
                    sb.append(counter).append(secondaryArray);
                }
            }else {
                sb.append(Integer.toString(counter)).append(secondaryArray);
                counter = 1;
                secondaryArray = c;
            }
        }

        return sb.toString();
    }
    String encode(String sampleInput) {
        char[] charArr = sampleInput.toCharArray();
        //char prev = (char) 0;
        int counter = 1;
        //compare each element with its next element and
        //if same increment the counter
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charArr.length; i++) {

            if (i + 1 < charArr.length && charArr[i] == charArr[i + 1]) {
                counter++;
            } else {
                //System.out.print(counter + Character.toString(charArr[i]));
                sb.append(counter + Character.toString(charArr[i]));
                counter = 1;
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        RunOLenghtSolutions bcd = new RunOLenghtSolutions();
        //BCD bcd = new BCD();
        System.out.println(bcd.encode(s.nextLine()));
        System.out.println();
       // System.out.println(bcd.FunctionAlgo(s.nextLine()));

    }
}
