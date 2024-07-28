package codewars;

public class TotalAmount {
    public static void main(String[] args) {
        System.out.println(points(new String[]{"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"}));
    }
    public static int points(String[] games) {
        //implement me
        int res = 0;
        for (String s : games){

            if(s.charAt(0) > s.charAt(2)){
                res += 3;
            }if(s.charAt(0) == s.charAt(2)) {
                res += 1;
            }

        }
        return res;
    }
}
