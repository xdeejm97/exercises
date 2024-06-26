package Loop;

import java.util.Arrays;

class Solutionn {

    public static void main(String[] args) {
        System.out.println(solution("^vv<v"));

    }

    public static int solution(String S) {
        // Implement your solution here


        int[] counts = new int[4];

        for (char c : S.toCharArray()){
            switch (c){
                case '<':
                    counts[0]++;
                    break;
                case '^':
                    counts[1]++;
                    break;
                case '>':
                    counts[2]++;
                    break;
                case 'v':
                    counts[3]++;
            }
        }
        int counter = 0;
        for (int i = 0; i < counts.length; i++) {
            if(counts[i] > counter){
                counter = counts[i];
            }
        }

        int resultOfRotating = S.length() - counter;


        return resultOfRotating;
    }
}
