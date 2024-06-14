package com.lapa.programmers;

import java.util.Arrays;

public class Day240607_02 {

    /**
     * 응급도에 따라 환자를 진료하는 순서를 정하는 문제
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{23, 51, 12, 34, 56})));
    }

    public static int[] solution(int[] emergency) {
        int[] answer = {};
        int[] sortList = Arrays.stream(emergency).sorted().toArray();
        answer = Arrays.stream(emergency).map(i -> emergency.length - Arrays.binarySearch(sortList, i)).toArray();
        return answer;
    }
}
