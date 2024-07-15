package com.lapa.programmers.lapa202407;

public class Day240704_01 {

    public static void main(String[] args) {
        //
        int n = 100;

        int[] result = new int[n*n];

        for (int i = 0; i<n*n; i++) {
            if (i < n || i > (n*n - n -1)) {
                result[i] = 1;
            } else if (i % n == 0) {
                result[i] = 1;
            } else if (i % n == (n-1)) {
                result[i] = 1;
            } else {
                result[i] = 0;
            }

        }

        for (int i=0; i<n*n; i++) {
            if (i % n ==0) {
                System.out.println();
            }
            System.out.print(result[i]);
        }

    }
}


/**
 * public static void test(int n){
 */