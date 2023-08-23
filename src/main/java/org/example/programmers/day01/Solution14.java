package org.example.programmers.day01;

public class Solution14 {

    public int Solution14(int a, int b) {
        int answer1 = Integer.parseInt((Integer.toString(a) + Integer.toString(b)));

        int answer2 = 2 * a * b;

        if(answer1 > answer2) {
            return answer1;
        } else {
            return answer2;
        }
    }

    public static void main(String[] args) {

    }
}
