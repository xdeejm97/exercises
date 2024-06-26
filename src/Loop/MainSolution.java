package Loop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainSolution {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> listOfIntegers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            listOfIntegers.add(sc.nextInt());
        }
        int countOper = sc.nextInt();

        for (int i = 0; i < countOper; i++) {

            if(sc.next().equals("Insert")){
                listOfIntegers.add(sc.nextInt(), sc.nextInt());
            } else {
                listOfIntegers.remove(sc.nextInt());
            }
        }

        for (int intss:
             listOfIntegers) {
            System.out.print(intss + " ");
        }
    }
}
