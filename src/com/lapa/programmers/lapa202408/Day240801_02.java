package com.lapa.programmers.lapa202408;

public class Day240801_02 {

    // aAb1B2cC34oOp
    // 10
    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));
    }

    public static int solution(String my_string) {
        int answer = 0;
        String temp = my_string.replaceAll("[A-Z|a-z]", "");

        for (int i=0; i<temp.length(); i++) {
            answer += Integer.parseInt(String.valueOf(temp.charAt(i)));
        }
        return answer;
    }
}
