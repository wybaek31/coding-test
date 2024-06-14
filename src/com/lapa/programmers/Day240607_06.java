package com.lapa.programmers;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Day240607_06 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(solution("205"));
    }

    public static String solution(String rsp) {
        return Arrays.stream(rsp.split("")).map(i -> {
            if (i.equals("2")) {
                return "0";
            } else if (i.equals("0")) {
                return "5";
            } else {
                return "2";
            }
        }).collect(Collectors.joining(""));
    }
}
