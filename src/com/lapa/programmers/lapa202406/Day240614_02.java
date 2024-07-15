package com.lapa.programmers.lapa202406;

import java.util.Arrays;

public class Day240614_02 {

    public static void main(String[] args) {
        System.out.println(Arrays.stream(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2)).toString());
    }

    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = {};

        for (int j=0; j<n; j++)  {
            int[] temp = new int[num_list.length];
            for (int i=0; i<num_list.length; i++) {
                temp[i] = num_list[i] % n;
            }
            answer[j] = temp;
        }

        return answer;
    }
}
