package org.example.programmers.day20;


public class Main {

    public int[] solution(long n) {
        //
        String str = Long.toString(n);
        String reversed = new StringBuilder(str).reverse().toString();
        char[] arr = reversed.toCharArray();

        int[] result = new int[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[i] - '0';
        }
        return result;
    }

    public static void main(String[] args) {
        Main main = new Main();

        int[] solution = main.solution(12345);
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}
