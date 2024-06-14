package com.lapa.programmers;

public class Day240607_07 {

    /**
     *
     * 머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다. 머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때,
     * balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(solution(5, 3));
    }

    public static int solution(int balls, int share) {
        return Math.round((float) factorial(balls) / (factorial(share) * factorial(balls - share)));
    }

    public static int factorial(int n) {
        return n == 0 ? 1 : n * factorial(n - 1);
    }
}