package com.lapa.programmers;

import java.util.Arrays;

public class Day240130_02 {

    public static void main(String[] args) {
        System.out.println(solution2(new int[] {9, -1, 0}));
    }

    public static int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }

    // 삽입 정렬
    public static int solution2(int[] array) {
        for (int i=1; i<array.length; i++) {
            int key = array[i];
            int j = i-1;

            while (j >=0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
        return array[array.length / 2];
    }
}
