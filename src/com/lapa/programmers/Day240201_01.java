package com.lapa.programmers;

import java.util.HashMap;
import java.util.Map;

public class Day240201_01 {

    public static void main(String[] args) {
        System.out.println(solution(new int[] {1}));
    }

    public static int solution(int[] array) {

        int answer = 0;
        int maxCount = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<array.length; i++) {
            int count = map.getOrDefault(array[i], 0) + 1;

            if (count > maxCount) {
                maxCount = count;
                answer = array[i];
            } else if (count == maxCount) {
                answer = -1;
            }
            map.put(array[i], count);
        }

        return answer;
    }
}
