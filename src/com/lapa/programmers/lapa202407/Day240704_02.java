package com.lapa.programmers.lapa202407;

public class Day240704_02 {

    public static void main(String[] args) {
        //
        int n = 100;

        int[][] result = new int[n][n];

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (i == 0 || i == n-1) {
                    result[i][j] = 1;
                } else if (j == 0 || j == n-1) {
                    result[i][j] = 1;
                }
                else {
                    result[i][j] = 0;
                }
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }

    }
}


/**
 * public static void test(int n){
 */