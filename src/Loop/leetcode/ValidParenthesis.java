package Loop.leetcode;

public class ValidParenthesis {
    public static void main(String[] args) {

        String s = "(]";
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;

        for (int i = 0; i < s.length(); i++) {

            switch (s.charAt(i)) {
                case '(':
                    counter1++;
                    break;
                case ')':
                    counter1--;
                    break;
                case '[':
                    counter2++;
                    break;
                case ']':
                    counter2--;
                    break;
                case '{':
                    counter3++;
                    break;
                case '}':
                    counter3--;
                    break;
            }
        }
        int sum = counter1 + counter2 + counter3;
        if(counter1 != 0){
            System.out.println("bad");
        }else if(counter2 != 0){
            System.out.println("bad");
        }

    }
}
