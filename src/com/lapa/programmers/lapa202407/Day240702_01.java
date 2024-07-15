package com.lapa.programmers.lapa202407;

import java.util.Arrays;
import java.util.HashSet;

public class Day240702_01 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Arrays.stream(Arrays.stream(solution(new int[]{5, 0, 2, 7})).toArray()).toArray()));
    }

    public static int[] solution(int[] input) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i<input.length-1; i++) {
            for (int j=i+1; j<input.length; j++) {
                set.add(input[i]+ input[j]);
            }
        }
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
