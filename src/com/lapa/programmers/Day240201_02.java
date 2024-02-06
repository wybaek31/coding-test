package com.lapa.programmers;

import java.util.*;
import java.util.stream.IntStream;

public class Day240201_02 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(15)));
    }

    public static int[] solution(int n) {
        return IntStream.rangeClosed(0, n).filter(i -> i%2 != 0).toArray();
    }

    public static int[] solution2(int n) {
        List<Integer> answer = new ArrayList<>();

        for (int i=1; i<=n; i++) {
            if (i%2 != 0) {
                answer.add(i);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
