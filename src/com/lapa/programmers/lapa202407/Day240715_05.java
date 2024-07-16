package com.lapa.programmers.lapa202407;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day240715_05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Character, Character> define = new HashMap<>();
        define.put('(', '(');
        define.put('{', '{');
        define.put('[', '[');

        while (sc.hasNext()) {
            String input=sc.next();
            ArrayDeque<Character> stack = new ArrayDeque<>();
            //Complete the code
            A: for (int i = 0; i<input.length(); i++) {
                if (stack.isEmpty()) {
                    if (!define.containsKey(input.charAt(i))) {
                        stack.push(input.charAt(i));
                        break A;
                    } else {
                        stack.push(input.charAt(i));
                        continue;
                    }
                }

                if (define.containsKey(input.charAt(i))) {
                    stack.push(input.charAt(i));
                } else {
                    stack.pop();
                }
            }
            System.out.println(stack.isEmpty());

        }


        sc.close();
    }

}

