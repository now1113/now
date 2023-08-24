package org.example.programmers.day02;

public class Solution5 {


//    입출력 예
//    n	return
//    12345	[5,4,3,2,1

    public int[] solution(long n) {

        String str = String.valueOf(n);
        int length = str.length();

        int[] answer = new int[length];
        int j = 0;

        for (int i = length-1; i >= 0; i--) {
            char c = str.charAt(i);
            int numericValue = Character.getNumericValue(c);
            answer[j] = numericValue;
            j++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution5 sol = new Solution5();

        long longs = 12345;
        sol.solution(longs);
    }
}
