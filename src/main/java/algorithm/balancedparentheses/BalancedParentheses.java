package algorithm.balancedparentheses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BalancedParentheses {


    /**
     * Method of checking parentheses
     * Stack method used to implement logic
     * 
     * @param s
     * @return
     */
    public static boolean checkBalancedParentheses(String s){
        Stack<Character> st = new Stack<>();
        for (int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                st.push('(');
            }else if(s.charAt(i) == ')'){
                if(st.size() == 0){
                    return false;
                }
                st.pop();
            }
        }
        if(st.size()==0){
            return true;
        }

        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        boolean flag = checkBalancedParentheses(s);
        if(flag){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
