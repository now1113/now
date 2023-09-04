package org.example.programmers.day08;

import java.util.stream.IntStream;

public class Main {

//    문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
//    각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
//
//    제한 사항
//    문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
//    첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.

    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] strArr = s.split(" ");

        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (j % 2 == 0) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(Character.toLowerCase(c));
                }
            }
            if(i < strArr.length - 1)
                sb.append(" ");

        }
        System.out.println("sb.toString() = " + sb.toString());
        return sb.toString();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.solution("try hello world");
    }
}
