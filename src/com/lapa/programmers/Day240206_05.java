package com.lapa.programmers;

import java.util.Scanner;

public class Day240206_05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<n+1; i++) {
            System.out.println("*".repeat(i));
        }
    }
}
