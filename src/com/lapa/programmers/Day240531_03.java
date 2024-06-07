package com.lapa.programmers;

public class Day240531_03 {

    public static void main(String[] args) {
        System.out.println((solution(64, 6)));
    }

    // 양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다.
    public static int solution(int n, int k) {
        int minus = n /10;
        int kCount = Math.max(k - minus, 0);

        return 12000 * n + 2000 * kCount;
    }
}
