package org.example.programmers.day02;

import java.util.List;

public class Solution3 {


    public double solution3(int[] arr) {
        double answer = 0;
        double sum = 0;

        for (int i : arr) {
            sum += i;
        }

        answer = sum / arr.length;

        return answer;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        Solution3 sol = new Solution3();
        double v = sol.solution3(arr);
        System.out.println("v = " + v);
    }
}
