package codewars;


import java.util.Arrays;

public class TheOffice {
    public static void main(String[] args) {


        String[] words = {"Hello", "World", "hi"};
        String joined = String.join(", ", words);
        System.out.println(joined);
        System.out.println(betterThanAverage(new int[] {100, 40, 34, 57, 29, 72, 57, 88}, 75));
    }
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        // Your code here

        int avg = (Arrays.stream(classPoints).sum() + yourPoints) / (classPoints.length + 1);
        return yourPoints > avg;
    }
}
