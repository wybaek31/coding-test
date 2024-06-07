package com.lapa.programmers;

import java.util.Arrays;

public class Day240531_05 {

    public static void main(String[] args) {
        System.out.println((Arrays.toString(solution(new int[]{1, 2, 3, 4, 5}, 1, 3))));
    }

    public static int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.stream(numbers, num1, num2 + 1).toArray();
    }
}
