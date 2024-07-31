package com.lapa.programmers.lapa202407;

import java.util.HashMap;
import java.util.Map;

public class Day240726_03 {
    // 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다. 문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
    public static void main(String[] args) {
        System.out.println(solution("bus"));
    }

    public static String solution(String my_string) {
        Map<Character, Character> alphabet = new HashMap<>();
        alphabet.put('a', 'a');
        alphabet.put('e', 'e');
        alphabet.put('i', 'i');
        alphabet.put('o', 'o');
        alphabet.put('u', 'u');
        StringBuilder result = new StringBuilder();
        for (char a : my_string.toCharArray()) {
            if (!alphabet.containsKey(a)) {
                result.append(a);
            }
        }
        return result.toString();

    }

}

