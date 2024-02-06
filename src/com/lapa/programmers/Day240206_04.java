package com.lapa.programmers;

public class Day240206_04 {

    public static void main(String[] args) {
        System.out.println(solution2("jaron"));
    }

    public static String solution(String my_string) {
        char[] answer = new char[my_string.length()];
        for (int i=0; i<my_string.length(); i++) {
            answer[i] = my_string.charAt(my_string.length()-i-1);
        }
        return String.valueOf(answer);
    }

    public static String solution2(String my_string) {
        StringBuffer buffer = new StringBuffer(my_string);
        return buffer.reverse().toString();
    }
}
