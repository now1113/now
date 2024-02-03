package org.example.programmers.day24;

public class Main {

    private int solution(int value) {
        //
        int answer = 0;
        String str = Integer.toString(value, 3);
        String reversed = new StringBuilder(str).reverse().toString();
        answer = Integer.valueOf(reversed, 3);

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.solution(45);
    }
}