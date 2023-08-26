package org.example.programmers.day03;

import java.util.Arrays;

public class Solution4 {

//    numbers	        result
//    [1,2,3,4,6,7,8,0]	14
//    [5,8,4,0,6,7,9]	6

    public int solution(int[] numbers) {
        int[] all = {0,1,2,3,4,5,6,7,8,9};
        int allSum = Arrays.stream(all).sum();
        int target = Arrays.stream(numbers).sum();

        return allSum - target;
    }

    public static void main(String[] args) {
        Solution4 sol = new Solution4();

        int[] num = {1,2,3,4,6,7,8,0};

        int solution = sol.solution(num);
//        System.out.println("solution = " + solution);

    }
}
