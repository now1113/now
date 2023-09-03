package org.example.programmers.day07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public int solution(int n) {

        //왜 안될까..
        List<Integer> arr = new ArrayList<>();
        int quo = n;
        int remain = 0;
        int cnt = 0;

        while(true) {
            if(cnt < 1) {
                remain = quo % 3;
                arr.add(remain);
            }
            cnt++;

            quo = quo / 3;
            remain = quo % 3;

            arr.add(remain);
            if(quo <= 1) {
                break;
            }
        }

        for (Integer i : arr) {
            System.out.println("i = " + i);
        }

        int sum = IntStream.range(0, arr.size())
                .map(i -> arr.get(arr.size() - 1 - i) * (int) Math.pow(3, i))
                .sum();

        return sum;

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.solution(45);
        main.solution(125);
    }
}
