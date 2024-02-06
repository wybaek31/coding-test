package com.lapa.programmers;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Day240201_05 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

    public static double solution(int[] numbers) {
        int sum = Arrays.stream(numbers).sum();
        return (double) sum / numbers.length;
    }

}
