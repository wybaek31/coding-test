package com.lapa.programmers;

import java.util.stream.IntStream;

public class Day240531_04 {

    public static void main(String[] args) {
        System.out.println((solution(10)));
    }

    public static int solution(int n) {
        return IntStream.rangeClosed(0, n).filter(i -> i % 2 == 0).sum();
    }
}
