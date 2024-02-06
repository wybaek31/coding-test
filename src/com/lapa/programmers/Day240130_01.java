package com.lapa.programmers;

public class Day240130_01 {

    public static void main(String[] args) {
//        solution(1,2,3,4);
        solution(9,2,1,3);
    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 분모
        int denom = lcm(denom1, denom2);

        // 분자
        int numer = (numer1 * (denom / denom1)) + (numer2 * (denom / denom2));

        int gcd = gcd(denom , numer);
        return new int[] { numer / gcd, denom / gcd };
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }
}
