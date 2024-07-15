package com.lapa.programmers.lapa202407;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Day240702_02 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4,5}));
    }

    public static int[] solution(int[] input) {
        int[][] answer = {
            {1,2,3,4,5},
            {2,1,2,3,2,4,2,5},
            {3,3,1,1,2,2,4,4,5,5}
        };

        int[] result = {0,0,0};
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                if (input[i] == answer[j][i]) {
                    result[j] = result[j] + 1;
                    break;
                }
            }
        }

        int max = Arrays.stream(result).max().getAsInt();
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i=0; i<result.length; i++) {
            if (max == result[i]) {
                resultList.add(i);
            }
        }
        resultList.forEach(System.out::println);

        return null;
    }
}
