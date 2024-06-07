package com.lapa.programmers;

import java.util.Arrays;
import java.util.Scanner;

public class Day240213_01 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
    }

    public static int[] solution(int[] num_list) {
        int[] answer = {};
        int evenNumber = 0;
        int oddNumber = 0;

        for (int i=0; i<num_list.length; i++) {
            int a = num_list[i] % 2;
            if (a == 0) {
                evenNumber += 1;
            } else {
                oddNumber += 1;
            }
        }
        return new int[] {evenNumber, oddNumber};
    }
}
