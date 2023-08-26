package org.example.programmers.day03;

public class Solution3 {

    public String solution(String phone_number) {
        int length = phone_number.length();
        String masked = "*".repeat(length - 4);
        String end = phone_number.substring(length - 4);

        return masked + end;
    }

    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        String solution = sol.solution("01033334444");
        System.out.println("solution = " + solution);
    }
}
