package codewars;

public class AscDEsc {
    public static void main(String[] args) {
        System.out.println(isAscOrder(new int[]{1,2}));
    }
    public static boolean isAscOrder(int[] arr) {
        // TODO
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]){
                return false;
            }

        }
        return true;

    }
}
