package com.lapa.programmers;

import java.util.Arrays;

public class Day240206_03 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
    }

    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for (int i=num_list.length-1; i>=0; i--) {
            answer[num_list.length-i-1] = num_list[i];
        }
        return answer;
    }

}
