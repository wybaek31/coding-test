package com.lapa.programmers.lapa202407;

import java.util.ArrayDeque;

public class Day240710_03 {
    public static void main(String[] args) {
        System.out.println(solution(12345));
    }

    public static String solution(int input) {
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();

        int temp = input;
        while (input != 0) {
            stack.push(input % 2);
            input = input / 2;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }
}
