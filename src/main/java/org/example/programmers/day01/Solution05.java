package org.example.programmers.day01;

import java.util.Scanner;

public class Solution05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(String.format("%d + %d = ", a, b) + (a + b));
    }
}
