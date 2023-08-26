package org.example.programmers.day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class Solution {

//    [5, 9, 7, 10]	5	[5, 10]
//    [2, 36, 1, 3]	1	[1, 2, 3, 36]
//    [3,2,6]	10	[-1]

    public List<Integer> solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        int i = 0;
        int cnt = 0;
        while(i < arr.length) {
            if(arr[i] % divisor == 0) {
                answer.add(arr[i]);
                cnt++;
            }
            i++;
        }
        if(cnt == 0) {
            answer.add(-1);
        }
        Collections.sort(answer);

        return answer;

        //속도가 매우 느리다..
//        List<Integer> answer = Arrays.stream(arr)
//                .filter(n -> n % divisor == 0)
//                .sorted()
//                .boxed()
//                .collect(Collectors.toList());
//
//        if (answer.isEmpty()) {
//            answer.add(-1);
//        }
//
//        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;

        List<Integer> solution = sol.solution(arr, divisor);
        for (Integer i : solution) {
            System.out.println("i = " + i);
        }
    }
}
