package com.lapa.programmers.lapa202408;

import java.util.Arrays;

public class Day240801_01 {

    // hi12392
    // [1, 2, 2, 3, 9]
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Arrays.stream(Arrays.stream(solution("p2o4i8gj2")).toArray()).toArray()));
    }

    public static int[] solution(String my_string) {
        int[] answer = new int[my_string.length()];

        for (int i=0; i<my_string.length(); i++) {
            int temp = my_string.charAt(i);
            if (temp >= 48 && temp <= 57) {
                answer[i] = Character.getNumericValue(temp);
            } else {
                answer[i] = -1;
            }
        }
        return Arrays.stream(answer).sorted().filter(value -> value >= 0).toArray();
    }
}
