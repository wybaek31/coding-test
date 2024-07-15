package com.lapa.programmers.lapa202407;

import java.util.ArrayDeque;

public class Day240710_04 {
    public static void main(String[] args) {
        System.out.println(solution("cdcd"));
    }

    public static int solution(String input) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i=0; i<input.length(); i++) {
            char c = input.charAt(i);
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }

            char pop = stack.pop();
            if (pop != c) {
                stack.push(pop);
                stack.push(c);
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
