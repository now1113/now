package org.example.programmers.day12;

import java.util.Arrays;

public class Main {

    public int solution(int[][] sizes) {
        int prevMax = 0;
        int prevMin = 0;

        for (int[] size: sizes) {
            int curMax = Math.max(size[0], size[1]);
            int curMin = Math.min(size[0], size[1]);

            prevMax = Math.max(curMax, prevMax);
            prevMin = Math.max(curMin, prevMin);
        }

        return prevMax * prevMin;
    }

    public static void main(String[] args) {
        Main main = new Main();
        int[][] arr = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int solution = main.solution(arr);
        System.out.println("solution = " + solution);

    }
}
