package com.lapa.programmers;

import java.util.Arrays;

public class Day240607_03 {

    /**
     * 응급도에 따라 환자를 진료하는 순서를 정하는 문제
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(solution(100));
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i =1; i<=n; i++) {
            if (n % i == 0) {
                answer += 1;
            }
        }
        return answer;
    }
}
