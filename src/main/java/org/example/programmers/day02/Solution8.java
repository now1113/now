package org.example.programmers.day02;

import java.util.*;

public class Solution8 {

//    n	        return
//    118372	873211

    public long solution(long n) {

        String answer2 = "";
        String s = String.valueOf(n);

        Integer[] longArr = new Integer[s.length()];

        for (int i = 0; i < s.length(); i++) {
            longArr[i] = Character.getNumericValue(s.charAt(i));
        }
        Arrays.sort(longArr, Collections.reverseOrder());

        for (int i = 0; i < longArr.length; i++) {
            answer2 += longArr[i];
        }

        return Long.parseLong(answer2);

    }
    public static void main(String[] args) {

        Solution8 sol = new Solution8();
        sol.solution(118372);
    }

}
