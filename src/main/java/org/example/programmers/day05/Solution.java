package org.example.programmers.day05;

import java.util.Arrays;

public class Solution {

//    arr1	            arr2	        return
//    [[1,2],[2,3]]	    [[3,4],[5,6]]	[[4,6],[7,9]]
//    [[1],[2]]	        [[3],[4]]	    [[4],[6]]

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer;
        if(arr2[0].length > 1) {
            answer = new int[arr1.length][arr2.length];
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    answer[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
        } else {
            answer = new int[arr1.length][arr2[0].length];
            for (int i = 0; i <= arr1[0].length; i++) {
                for (int j = 0; j < arr2[0].length; j++) {
                    answer[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};
        int[][] solution2 = sol.solution(arr1, arr2);
        for (int[] ints : solution2) {
            for (int anInt : ints) {
                System.out.println("anInt = " + anInt);
            }
        }
//
        int[][] arr3 = {{1},{2}};
        int[][] arr4 = {{3}, {4}};
        int[][] solution = sol.solution(arr3, arr4);
//        for (int[] ints : solution) {
//            for (int anInt : ints) {
//                System.out.println("anInt = " + anInt);
//            }
//        }
    }
}
