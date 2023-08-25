package org.example.programmers.day02;

public class Solution11 {

//    1-1. 입력된 수가 짝수라면 2로 나눕니다.
//    1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
//    2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.

//    n	        result
//    6	        8
//    16	    4
//    626331	-1
//    6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1
    public long solution(long num) {

        long answer = 0;

        while(num != 1) {
            if(num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            answer++;

            if(answer == 500) {
                return -1;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Solution11 sol = new Solution11();
        long solution = sol.solution(626331);
        System.out.println("solution = " + solution);
    }
}
