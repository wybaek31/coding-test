package com.lapa.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Day240201_03 {

    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    public static int solution(int n) {

        int result = 1;

        while ( (6*result) % n != 0) {
            result++;
        }
        return result;
    }

}
