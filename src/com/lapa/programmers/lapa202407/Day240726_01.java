package com.lapa.programmers.lapa202407;

public class Day240726_01 {

    public static void main(String[] args) {
        System.out.println(solution(7));
    }

    public static int solution(int n) {
        int result = 0;

        return factorial(5);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }

}

