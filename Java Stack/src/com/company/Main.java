package com.company;

import java.util.*;

public class Main {

    private static final char BRACKET_RIGHT = '}';
    private static final char BRACKET_LEFT = '{';

    private static final char SQ_BRACKET_RIGHT = ']';
    private static final char SQ_BRACKET_LEFT = '[';

    private static final char PARENTHESES_RIGHT = ')';
    private static final char PARENTHESES_LEFT = '(';

    public static void main(String[] args) {
        Stack<Character> s;

        Scanner scan = new Scanner(System.in);

        String input;
        boolean isBalancedString;
        while(scan.hasNextLine()){
            input = scan.nextLine();
            s = new Stack<>();
            isBalancedString = true;

            for(int i = 0; i<input.length(); i++){
                switch (input.charAt(i)){
                    case BRACKET_LEFT:
                        s.push(BRACKET_LEFT);
                        break;
                    case SQ_BRACKET_LEFT:
                        s.push(SQ_BRACKET_LEFT);
                        break;
                    case PARENTHESES_LEFT:
                        s.push(PARENTHESES_LEFT);
                        break;
                    case BRACKET_RIGHT:
                        if(!s.isEmpty() && s.peek().equals(BRACKET_LEFT)){
                            s.pop();
                        } else{
                            isBalancedString = false;
                            continue;
                        }
                        break;
                    case SQ_BRACKET_RIGHT:
                        if(!s.isEmpty() && s.peek().equals(SQ_BRACKET_LEFT)){
                            s.pop();
                        } else{
                            isBalancedString = false;
                            continue;
                        }
                        break;
                    case PARENTHESES_RIGHT:
                        if(!s.isEmpty() && s.peek().equals(PARENTHESES_LEFT)){
                            s.pop();
                        } else{
                            isBalancedString = false;
                            continue;
                        }
                        break;
                    default:{
                        System.out.println("UNEXPECTED CHAR");
                        return;
                    }
                }
            }

            System.out.println(isBalancedString && s.isEmpty() ? "true" : "false");
        }

    }
}
