package com.lapa.programmers.lapa202407;

import java.util.ArrayDeque;
import java.util.HashMap;

public class Day240710_02 {
    public static void main(String[] args) {
        System.out.println(solution("(())()"));
    }

    public static boolean solution(String input) {
        ArrayDeque<Character> stack = new ArrayDeque<Character>();

        for (int i=0; i<input.length(); i++) {
            char c = input.charAt(i);

            if ('(' == c) {
                stack.push(c);
            } else {
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
