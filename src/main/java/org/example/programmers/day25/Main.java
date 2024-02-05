package org.example.programmers.day25;

public class Main {

    private int countZeros(String s) {
        //
        int zeros = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') zeros++;
        }
        return zeros;
    }

    private int[] solution(String s) {
        //
        int loop = 0;
        int removed = 0;

        while (!s.equals("1")) {
            //
            int zeros = countZeros(s);
            loop += 1;
            removed += zeros;

            int ones = s.length() - zeros;
            s = Integer.toString(ones, 2);
        }

        return new int[] {loop, removed};
    }

    public static void main(String[] args) {
        //
        Main main = new Main();
        main.solution("110010101001");
    }
}