package org.example.programmers.day02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Solution3 {


    //2.5
    public double sol(int[] arr) {
        return Arrays.stream(arr)
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        int[] arr2 = {5, 5};

        Solution3 sol = new Solution3();
        double sol1 = sol.sol(arr2);
        System.out.println("sol1 = " + sol1);
    }
}
