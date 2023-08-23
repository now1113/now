package org.example.programmers.day01;

import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        String out = "";

        int length = a.length();

        for (int i = 0; i < length; i++) {
            char c = a.charAt(i);

            if(Character.isLowerCase(c)) {
                out += Character.toUpperCase(c);
            } else {
                out += Character.toLowerCase(c);
            }
        }

        System.out.println(out);
    }
}
