package com.lapa.programmers;

public class Day240213_02 {

    public static void main(String[] args) {
        System.out.println((solution("hello", 3)));
    }

    public static String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        for (int i=0; i<my_string.length(); i++) {
            for (int j=0; j<n; j++) {
                answer.append(my_string.charAt(i));
            }
        }
        return answer.toString();
    }
}
