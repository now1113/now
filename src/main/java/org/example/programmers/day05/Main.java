package org.example.programmers.day05;

public class Main {

    public boolean solution(String s) {
        boolean answer = true;

        if(s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                if(!Character.isDigit(s.charAt(i))) {
                    return false;
                }
            }
            return answer;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        boolean solution = main.solution("123456");
        System.out.println("solution = " + solution);


    }
}
