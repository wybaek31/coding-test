package com.lapa.programmers.lapa202407;

import java.util.Arrays;

public class Day240725_03 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{0, 31, 24, 10, 1, 9}));
    }

    public static int solution(int[] numbers) {

        Arrays.sort(numbers);

        return numbers[numbers.length-1] * numbers[numbers.length-2];
    }
}

