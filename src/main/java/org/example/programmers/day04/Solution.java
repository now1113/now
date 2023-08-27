package org.example.programmers.day04;

public class Solution {

//    s	        return
//   "abcde"	"c"
//   "qwer"	    "we"

    public String solution(String s) {
        int i = s.length() / 2;
        if(s.length() % 2 == 0) {
            return s.substring(i-1, i+1);
        } else {
            return s.substring(i, i+1);
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String solution = sol.solution("qwer");
        System.out.println("solution = " + solution);

    }

}
