package com.lapa.programmers.lapa202406;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Day240627_01 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 2, 2, 1, 3, 4}));
    }

    public static int[] solution(int[] arr) {
        Integer[] aa = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(aa);

        return null;

    }
}
