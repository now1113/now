package org.example.programmers.day04;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution3 {

//    a	        b	        result
//    [1,2,3,4]	[-3,-1,0,2]	3
//    [-1,0,1]	[1,0,-1]	-2

    public int solution(int[] a, int[] b) {
        int length = a.length;
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = a[i] * b[i];
        }

        return Arrays.stream(arr)
                .sum();

        //이것도 왤케 느리냐..
//        return IntStream.range(0, a.length)
//                .map(i -> a[i] * b[i])
//                .sum();
    }

    public static void main(String[] args) {

        Solution3 sol = new Solution3();
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};
        int solution = sol.solution(a, b);
        System.out.println("solution = " + solution);
    }
}
