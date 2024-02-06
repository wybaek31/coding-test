package com.lapa.programmers;

public class Day240201_04 {

    public static void main(String[] args) {
        System.out.println(solution(4, 10));
    }

    public static int solution(int slice, int n) {
        int result = n % slice == 0 ? n / slice : n / slice + 1;
        return result;
    }

}
