package org.example.programmers.day07;



public class Main {

    public int solution(int n) {

        StringBuilder ternary = new StringBuilder();

        while (n > 0) {
            ternary.append(n % 3);
            System.out.println("ternary = " + ternary);
            n /= 3;
        }

        return Integer.parseInt(ternary.toString(), 3);

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.solution(45);
        main.solution(125);
    }
}
