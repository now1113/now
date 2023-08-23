package org.example.programmers.day01;

public class Solution13 {

    public int Solution13(int a, int b) {
        int answer = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int answer2 = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        if(answer > answer2){
            return answer;
        }else{
            return answer2;
        }
    }

    public static void main(String[] args) {


    }
}
