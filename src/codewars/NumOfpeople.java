package codewars;

import java.util.ArrayList;

public class NumOfpeople {
    public static void main(String[] args) {

    }
    public static int countPassengers(ArrayList<int[]> stops) {
        //Code here!
        int res = 0;
        for (int[] stop : stops) {
            res = stop[0] - stop[1];
        }
        return res;
    }

}
