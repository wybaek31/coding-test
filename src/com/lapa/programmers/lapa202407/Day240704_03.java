package com.lapa.programmers.lapa202407;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Day240704_03 {

    public static void main(String[] args) {
        solution("ULURRDLUU");
    }

    private static final HashMap<Character, int[]> location = new HashMap<>();

    private static void initLocation() {
        location.put('U', new int[]{1, 0});
        location.put('D', new int[]{-1, 0});
        location.put('R', new int[]{0, 1});
        location.put('L', new int[]{-1, 0});
    }



    public static void solution(String input) {

        initLocation();
        HashSet<String> result = new HashSet<>();

        int x, y = 5;

        for (int i=0; i<input.length(); i++) {

        }


    }
}
