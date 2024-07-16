package com.lapa.programmers.lapa202407;

import java.util.Scanner;

public class Day240715_04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){

            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            in.nextLine();

            for (int j=0; j<n; j++) {
                int result = a;
                int x = 1;
                for (int k=0; k<=j; k++) {
                    result += x*b;
                    x = x*2;
                }
                System.out.printf("%d ", result);
            }
            System.out.println();

        }
        in.close();
    }

}

