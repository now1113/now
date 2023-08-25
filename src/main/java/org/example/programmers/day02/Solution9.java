package org.example.programmers.day02;

public class Solution9 {

//    10	true
//    12	true
//    11	false
//    13	false

    public boolean solution(int x) {

        int sum = 0;
        for (char c : String.valueOf(x).toCharArray()) {
            sum += c - '0';
        }
        return x % sum == 0;
    }

    public static void main(String[] args) {
        Solution9 sol = new Solution9();
        boolean solution = sol.solution(11);
        System.out.println("solution = " + solution);

    }
}
