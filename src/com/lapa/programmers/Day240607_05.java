package com.lapa.programmers;

import java.util.Arrays;

public class Day240607_05 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(solution(".... . .-.. .-.. ---"));
    }

    public static String solution(String letter) {
        StringBuilder answer = new StringBuilder();
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] input = letter.split(" ");
        Arrays.stream(input).map(i -> {
            for (int j = 0; j < morse.length; j++) {
                if (i.equals(morse[j])) {
                    return (char)(j + 97);
                }
            }
            return "";
        }).forEach(answer::append);
        return answer.toString();
    }
}
