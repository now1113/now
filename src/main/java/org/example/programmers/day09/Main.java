package org.example.programmers.day09;

import java.util.Arrays;

public class Main {

    public int solution(int[] d, int budget) {
        int cnt = 0;
        int sum = 0;
        int chk = budget;

        Arrays.sort(d);

        while (budget > 0) {
            for (int i : d) {

                sum += i;
                if(sum <= chk) {
                    cnt++;
                }
                budget -= i;
                if(chk == sum) break;
            }
        }
        System.out.println("chk = " + chk);
        return cnt;
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
