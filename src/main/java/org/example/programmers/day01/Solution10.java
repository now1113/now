package org.example.programmers.day01;

import java.util.Scanner;

public class Solution10 {

    public String Solution10(String str1, String str2) {
        String answer = "";

        int length = str1.length();

        for (int i = 0; i < length; i++) {
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }

        return answer;
    }


    public static void main(String[] args) {


    }
}
