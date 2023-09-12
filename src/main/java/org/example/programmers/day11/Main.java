package org.example.programmers.day11;

import java.util.*;

public class Main {
    public long solution(String t, String p) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i <= t.length()-p.length(); i++) {
            String substring = t.substring(i, p.length()+i);
            list.add(substring);
        }
        return list.stream()
                .filter(i -> Long.parseLong(i) <= Long.parseLong(p))
                .count();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.solution("3141592", "271");
        main.solution("500220839878", "7");
    }
}
