package org.example.programmers.day02;

public class Solution7 {
    public long solution(long n) {

        double sqrt = Math.sqrt(n);
        if (sqrt % 1 == 0) {
            double v = sqrt + 1.0;
            return (long) v * (long) v;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        Solution7 sol = new Solution7();
        long solution = sol.solution(121);
        System.out.println("solution = " + solution);
    }
}
