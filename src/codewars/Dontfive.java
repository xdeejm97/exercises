package codewars;

public class Dontfive {
    public static void main(String[] args) {
        System.out.println(dontGiveMeFive(4, 17));
    }

    public static int dontGiveMeFive(int start, int end)
    {
        int res= 0;
        for (int i = start; i <= end; i++) {
            if (String.valueOf(i).contains("5")){
                continue;
            }else {
                res++;
            }
        }
        return res;
    }
}
