package org.example.programmers.day10;

import java.util.Arrays;

public class Main {

//    number	                result
//    [-2, 3, 0, 2, -5]	        2
//    [-3, -2, -1, 0, 1, 2, 3]	5
//    [-1, 1, -1, 1]	        0

    public int solution(int[] number) {
        int answer = 0;

        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Main main = new Main();
        int[] arr = {-2, 3, 0, 2, -5};
        int[] arr2 = {-3, -2, -1, 0, 1, 2, 3};
        int[] arr3 = {-1, 1, -1, 1};
//        main.solution(arr);
        main.solution(arr2);
//        main.solution(arr3);

    }
}
