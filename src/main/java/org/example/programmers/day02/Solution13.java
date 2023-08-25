package org.example.programmers.day02;


import java.util.stream.IntStream;

public class Solution13 {

//    seoul	            return
//    ["Jane", "Kim"]	"김서방은 1에 있다"
    public String solution(String[] seoul) {
        int position = IntStream.range(0, seoul.length)
                .filter(i -> "Kim".equals(seoul[i]))
                .findFirst()
                .orElse(-1);
        return "김서방은 " + position + "에 있다";
    }

    public static void main(String[] args) {
        Solution13 sol = new Solution13();
        String[] test = {"Jane", "Kim"};
        String solution = sol.solution(test);
        System.out.println("solution = " + solution);
    }
}
