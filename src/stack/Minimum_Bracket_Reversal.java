package stack;

import java.util.Stack;

public class Minimum_Bracket_Reversal {
    public static int countBracketReversal(String input){
        if (input.length()%2!=0){
            return -1;

        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i)=='{'){
                stack.push('{');
            } else if (input.charAt(i)=='}') {
                if (stack.isEmpty()|| stack.peek()=='}'){
                    stack.push('}');
                } else if (stack.peek()=='{') {
                    stack.pop();

                }

            }


        }
        int count=0;
        while (stack.size()!=0){
            char c1 = stack.pop();
            char c2 = stack.pop();

            if (c1==c2){
                if(c2=='{'){
                    c2='}';
                }
                if (c1=='}'){
                    c1='{';
                }
                count++;
            }
            else{
                c1='{';
                c2 ='}';
                count++;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "{{{{}}";
        System.out.println(countBracketReversal(str));
    }
}
