package com.lapa.programmers.lapa202407;

public class Day240726_02 {

    public static void main(String[] args) {
        System.out.println(solution(3628800));
    }

    public static int solution(int n) {

        int result = 1;
        int i = 1;
        while (result * i < n) {
            i += 1;
            result = result * i;
        }

        return i;
    }

}

