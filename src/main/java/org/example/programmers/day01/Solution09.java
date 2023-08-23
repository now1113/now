package org.example.programmers.day01;

import java.util.Scanner;

public class Solution09 {

    public String Solution09(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0, s) + overwrite_string;

        if(my_string.length() > answer.length()) {
            System.out.println("answer.length() = " + answer.length());
            answer += my_string.substring(answer.length());
        }
        return answer;
    }

    public static void main(String[] args) {
        String myString = "";
        String overwriteString = "";
        int index = 0;

        Scanner sc = new Scanner(System.in);
        myString = sc.next();
        overwriteString =  sc.next();
        index = sc.nextInt();

        Solution09 sol = new Solution09();

        String answer = sol.Solution09(myString, overwriteString, index);
        System.out.println("answer = " + answer);

    }
}
