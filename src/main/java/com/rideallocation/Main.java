package com.rideallocation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    static void main() {
        import java.util.Stack;

        public class BalancedParentheses {

            public static boolean isBalanced(String s) {
                Stack<Character> stack = new Stack<>();

                for (char ch : s.toCharArray()) {

                    if (ch == '(' || ch == '{' || ch == '[') {
                        stack.push(ch);
                    }
                    else if (ch == ')' || ch == '}' || ch == ']') {

                        if (stack.isEmpty()) {
                            return false;
                        }

                        char top = stack.pop();

                        if ((ch == ')' && top != '(') ||
                                (ch == '}' && top != '{') ||
                                (ch == ']' && top != '[')) {
                            return false;
                        }
                    }
                }

                return stack.isEmpty();
            }

            public static void main(String[] args) {
                String s = "{[()]}";

                if (isBalanced(s)) {
                    System.out.println("Balanced");
                } else {
                    System.out.println("Not Balanced");
                }
            }
        }
    }
}