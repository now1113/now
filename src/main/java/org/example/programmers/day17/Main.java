package org.example.programmers.day17;

public class Main {

//    b는 처음 나왔기 때문에 자신의 앞에 같은 글자가 없습니다. 이는 -1로 표현합니다.
//    a는 처음 나왔기 때문에 자신의 앞에 같은 글자가 없습니다. 이는 -1로 표현합니다.
//    n은 처음 나왔기 때문에 자신의 앞에 같은 글자가 없습니다. 이는 -1로 표현합니다.
//    a는 자신보다 두 칸 앞에 a가 있습니다. 이는 2로 표현합니다.
//    n도 자신보다 두 칸 앞에 n이 있습니다. 이는 2로 표현합니다.
//    a는 자신보다 두 칸, 네 칸 앞에 a가 있습니다. 이 중 가까운 것은 두 칸 앞이고, 이는 2로 표현합니다.

    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(i == 0){
                answer[i] = -1;
                sb.append(c);
            } else {
                if (sb.toString().contains(String.valueOf(c))) {
                    int index = sb.toString().indexOf(c);
                    while (index >= 0) {
                        if (index != -1) {
                            answer[i] = i - index;
                        }
                        index = sb.toString().indexOf(String.valueOf(c), index + 1);
                    }
                } else {
                    answer[i] = -1;
                }
                sb.append(c);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();

        main.solution("banana");
        main.solution("foobar");

    }
}
