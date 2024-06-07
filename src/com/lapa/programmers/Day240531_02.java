package com.lapa.programmers;

public class Day240531_02 {

    public static void main(String[] args) {
        System.out.println((solution(70)));
    }

    public static int solution(int angle) {
        if (angle == 180) {
            return 4;
        } else if (angle < 180 && angle > 90) {
            return 3;
        } else if (angle == 90) {
            return 2;
        } else {
            return 1;
        }
    }
}
