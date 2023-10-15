package org.example.programmers.day16;


import java.util.*;

public class Main {

//    0	zero
//1	one
//2	two
//3	three
//4	four
//5	five
//6	six
//7	seven
//8	eight
//9	nine

    public int solution(String s) {

        List<String> numbers = List.of(
                "zero",
                "one",
                "two",
                "three",
                "four",
                "five",
                "six",
                "seven",
                "eight",
                "nine");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                sb.append(c);
            } else {
                for (String number : numbers) {
                    if (s.startsWith(number, i)) {
                        sb.append(numbers.indexOf(number));
                        i += number.length() - 1;
                        break;
                    }
                }
            }
        }
        String string = sb.toString();
        return Integer.parseInt(string);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.solution("one4seveneight");
        main.solution("23four5six7");
        main.solution("2three45sixseven");
    }
}
