package com.lapa.programmers;

import java.util.Arrays;

public class Day240206_02 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(15000)));
    }

    public static int[] solution(int money) {
        return new int[] {money / 5500, money % 5500};
    }

}
