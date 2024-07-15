package com.lapa.programmers.lapa202407;

import java.util.ArrayDeque;
import java.util.HashMap;

public class Day240710_01 {
    public static void main(String[] args) {
        System.out.println(solution("(){}[]"));
    }

    public static int solution(String input) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        int n = input.length();
        input += input;

        int result = 0;
        A:for (int i=0; i<n; i++) {
            ArrayDeque<Character> stack = new ArrayDeque<>();

            for (int j=i; j<i+n; j++) {
                char c = input.charAt(j);

                if (!map.containsKey(c)) {
                    stack.push(c);
                } else {
                    if (stack.isEmpty() || !stack.pop().equals(map.get(c)))
                        continue A;
                }
            }

            if (stack.isEmpty())
                result++;
        }

        return result;
    }
}
