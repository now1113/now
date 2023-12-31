package org.example.programmers.day21;

public class Main {

    private char push(char c, int n) {
        if(!Character.isAlphabetic(c)) return c;

        int offset = Character.isUpperCase(c) ? 'A' : 'a';
        int position = c - offset;
        position = (position + n) % ('Z' - 'A' + 1);
        return (char) (offset + position);
    }

    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(push(c, n));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Main main = new Main();
        String ab = main.solution("AB", 1);
        System.out.println("ab = " + ab);
    }
}
