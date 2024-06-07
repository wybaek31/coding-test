package com.lapa.programmers;

public class Day240531_01 {

    public static void main(String[] args) {
        System.out.println((solution("BCBdbe", "B")));
    }

    public static String solution(String my_string, String letter) {
        String answer = my_string.replaceAll(letter, "");;
        return answer;
    }
}
