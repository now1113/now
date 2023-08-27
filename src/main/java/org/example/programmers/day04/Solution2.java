package org.example.programmers.day04;

public class Solution2 {

//    n	return
//    3	"수박수"
//    4	"수박수박"

    public String solution(int n) {
        String answer = "수박";
        String repeat = answer.repeat(n);

        String substring = repeat.substring(0, n);

        return substring;
    }
    public static void main(String[] args) {

        Solution2 sol = new Solution2();
        String solution = sol.solution(3);
        System.out.println("solution = " + solution);

    }
}
