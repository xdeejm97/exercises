package Loop;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */




public class DateMain {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write a date in pattern: YYYY MM DD");

        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();


        DateMain dateMain = new DateMain();

        dateMain.findDay(year, month, day);
//        System.out.println(findDay());



    }
    public void findDay(int year, int month, int day) {

        LocalDate lc = LocalDate.of(year, month, day);
        System.out.println(lc.getDayOfWeek().toString());

    }
}
