package com.lapa.programmers.lapa202407;

public class Day240725_02 {

    public static void main(String[] args) {

        int x = 10;
        int result = 0;
        for (int i=1; i<=x; i++) {
            int count = 0;
            for (int j=1; j*j<=i; j++) {
                if (j*j == i) count += 1;
                else if (i % j == 0) count += 2;
            }

            if (count >= 3) {
                result += 1;
            }


        }
        System.out.println(result);

    }

}

