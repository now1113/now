package org.example.programmers.day15;

public class Main {


//    s	        n	result
//   "AB"	    1	"BC"
//   "z"	    1	"a"
//   "a B z"	4	"e F d"

    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                sb.append(ch);
                continue;
            }

            char base = (Character.isLowerCase(ch)) ? 'a' : 'A';
            ch = (char) (base + (ch - base + n) % 26);
            sb.append(ch);
        }
        return sb.toString();
    }
    public static void main(String[] args) {

        Main main = new Main();
        main.solution("AB", 1);
        main.solution("z", 1);
        main.solution("a B z", 4);

    }
}
