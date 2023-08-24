package org.example.programmers.day02;

public class Solution2 {

//        x	n	answer
//        2	5	[2,4,6,8,10]
//        4	3	[4,8,12]
//        -4	2	[-4, -8]
//
    public long[] solution2(int x, int n) {

        long j = 0;
        long[] answer = new long[n];

        for (int i = 0; i < n; i++) {
            j += x;
            answer[i] = j;
        }

        return answer;
    }
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        long[] longs = sol.solution2(2, 5);
        for (long aLong : longs) {
            System.out.println("aLong = " + aLong);
        }

    }
}
