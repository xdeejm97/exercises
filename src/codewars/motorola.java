package codewars;

import java.util.Arrays;

public class motorola {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{-5,0,3,0}));
    }

    public static int solution(int[] A) { // 7,4,-3,0,-5,1,-0
        // Implement your solution here
        if (A[0] == 0) {
            return -1;
        }



        int multiplications = 0;

        for (int i = 0; i < A.length; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < A.length; j += 4) {
                    if(A[j] < 0){
                        A[j] *= -1;
                        multiplications++;
                    }
                }
                for (int k = 2; k < A.length; k+=4) {
                    if(A[k] > 0){
                        A[k] *= -1;
                        multiplications++;
                    }
                    if(A[k] == 0){
                        return -1;
                    }
                }
            } else {
                if(A[i] != 0) {
                    A[i] = 0;
                    multiplications++;
                }
            }

        }
        for (int z = 1; z < A.length; z+=2) {
            if(z % 2 == 0){
                return -1;
            }
        }
        return multiplications;
    }
}
