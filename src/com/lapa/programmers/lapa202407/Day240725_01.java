package com.lapa.programmers.lapa202407;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day240725_01 {

    public static void main(String[] args) {
        int x=1000000000;
        int count = 0;

        for (int i=1; i<=x; i++) {
            if (x % i == 0) count += 1;
        }

        System.out.println(count);


        int N = 1000000000;

        int count1 = 0;
        for (int i = 1; i * i <= N; i++) {
            if (i * i == N) count1++;
            else if (N % i == 0) count1 += 2;
        }

        System.out.println(count1);
    }

}

