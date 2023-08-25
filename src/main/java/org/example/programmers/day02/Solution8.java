package org.example.programmers.day02;

import java.util.*;

public class Solution8 {

//    n	        return
//    118372	873211

    public long solution(long n) {

        String s = String.valueOf(n);
        char[] chars = s.toCharArray();

        Arrays.sort(chars);
        StringBuilder reversed = new StringBuilder(new String(chars)).reverse();

        return Long.parseLong(reversed.toString());
    }
    public static void main(String[] args) {

        Solution8 sol = new Solution8();
        long solution = sol.solution(118372);
        System.out.println("solution = " + solution);
    }

}
