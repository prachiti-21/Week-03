package com.stack;

class ParenthesisChecker {
    public static void main(String[] args) {
        BalanceParanthesis bp = new BalanceParanthesis("([])");
        if (bp.isBalanced("([])") == true) {
            System.out.println("String is balanced");
        } else {
            System.out.println("String is unbalanced");
        }
    }
}

