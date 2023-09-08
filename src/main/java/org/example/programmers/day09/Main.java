package org.example.programmers.day09;

import java.util.Arrays;

public class Main {

    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            if(budget < d[i]) break;

            budget -= d[i];
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {

        Main main = new Main();
        int[] d = {1, 3, 2, 5, 4};
        int budget = 9;
        main.solution(d, budget);

        int[] d2 = {2,2,3,3};
        int budget2 = 10;
        main.solution(d2, budget2);

    }
}
