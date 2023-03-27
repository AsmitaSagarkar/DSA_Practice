package stack;

import java.util.Stack;

public class Check_Redundant_Brackets {

    public static boolean checkRedundancy(String s){
        Stack<Character> stack = new Stack<>();
        char[] str = s.toCharArray();

        for (char ch: str) {
            if(ch==')')
            {
                char top = stack.peek();
                stack.pop();

                boolean flag = true;
                while(top!='('){
                    if (top=='+'|| top == '-' || top=='*' || top =='/'){
                        flag = false;
                    }
                    top=stack.peek();
                    stack.pop();
                }
                if (flag == true) {
                    return true;
                }
            }
            else{
                stack.push(ch);
            }

        }
        return false;
    }
    public static void findRedundant(String str){
        boolean ans = checkRedundancy(str);
        if (ans){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }

    public static void main(String[] args) {
        String str = "((a+b))";
        findRedundant(str);
    }
}
