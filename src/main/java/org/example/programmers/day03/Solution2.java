package org.example.programmers.day03;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution2 {

//    absolutes	signs	            result
//    [4,7,12]	[true,false,true]	9
//    [1,2,3]	[false,false,true]	0

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if(signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        return answer;

//        return Arrays.stream(absolutes)
//                .sum();
    }

    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        int[] a = {1,2,3};
        boolean[] b = {false,false,true};
        int solution = sol.solution(a, b);
        System.out.println("solution = " + solution);

    }
}
