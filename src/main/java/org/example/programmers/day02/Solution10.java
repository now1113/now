package org.example.programmers.day02;

public class Solution10 {

//    a	    b	return
//    3	    5	12
//    3	    3	3
//    5	    3	12

    public long solution(int a, int b) {
        long answer = 0;

        long min = Math.min(a, b);
        long max = Math.max(a, b);

        for (long i = min; i <= max; i++) {
            answer += i;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution10 sol = new Solution10();
        long solution = sol.solution(3, 5);
        System.out.println("solution = " + solution);
    }
}
