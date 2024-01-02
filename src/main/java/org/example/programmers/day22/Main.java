package org.example.programmers.day22;

public class Main {

    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean toUpper = true;

        for (char c : s.toCharArray()) {
            if (!Character.isAlphabetic(c)) {
                sb.append(c);
                toUpper = true;
            } else {
                if (toUpper) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(Character.toLowerCase(c));
                }
                toUpper = !toUpper;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Main main = new Main();
        String str = main.solution("try hello world");
        System.out.println("str = " + str);
    }
}
