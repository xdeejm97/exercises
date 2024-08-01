package codewars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OccurenceInt {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(deleteNth(new int[]{1, 2, 3, 1, 2, 1, 2, 3}, 2)));
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        //Code here ;)

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < elements.length; i++) {

            if(!map.containsKey(elements[i])){
                map.put(elements[i], i);
            }

        }
        System.out.println(map.toString());

        return null;
    }
}
