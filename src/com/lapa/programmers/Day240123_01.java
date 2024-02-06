package com.lapa.programmers;

public class Day240123_01 {

    public static void main(String[] args) {
//        System.out.println(solution2(3, 2));

//        System.out.println(gcd(12, 18));
    }

    public static int solution1(int num1, int num2) {
        return num1 - num2;
    }

    public static int solution2(int num1, int num2) {
        float result = (float)num1 / num2 * 1000;
        return (int)result;
    }

    public static int solution(int numer1, int denom1, int numer2, int denom2) {
        int denom = denom1 * denom2;
        int numer = numer1 * denom2 + numer2 * denom1;


        return 0;
    }

}
