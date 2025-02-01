package com.stack;

import java.util.Stack;
public class BalanceParanthesis {
    String str;

    BalanceParanthesis(String str) {
        this.str = str;
    }

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack();
        for (Character ch : str.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (!stack.isEmpty()) {
                    Character top = stack.pop();

                    if ((ch == ')' && top == '(') || (ch == ']' && top == '[') || (ch == '}' && top == '{')) {
                        //stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}

    /*public void print(){
        if(isBalanced(str)==true){
            System.out.println("String is balanced");
        }
        else{
            System.out.println("String is unbalanced");
        }
    }*/
    /*class ParenthesisChecker {
        public static void main(String[] args) {
            BalanceParanthesis bp = new BalanceParanthesis("([])");
            if (bp.isBalanced("([])") == true) {
                System.out.println("String is balanced");
            } else {
                System.out.println("String is unbalanced");
            }
        }
    }
}*/


