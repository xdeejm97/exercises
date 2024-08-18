package neetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("[(])"));

    }

    public static boolean isValid(String s) {

        Stack<Character> brackets = new Stack<>();
        Map<Character, Character> mapOfBrackets = new HashMap<>(3);

        mapOfBrackets.put(')', '(');
        mapOfBrackets.put('}', '{');
        mapOfBrackets.put(']', '[');

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if(mapOfBrackets.containsKey(c)){

                if(!brackets.isEmpty() && mapOfBrackets.get(c).equals(brackets.peek())){
                    brackets.pop();
                }else {
                    return false;
                }

            }else {
                brackets.push(c);
            }

        }
        return brackets.isEmpty();

    }
}
