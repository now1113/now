package org.example.programmers.day01;

public class Solution15 {

    public int Solution15(int n) {
        int answer = 0;
//        자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
//        예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

//        N	answer
//        123	6
//        987	24
        while(n > 0) {
            int i = n % 10;
            answer += i;
            n /= 10;
        }
        return answer;

    }
    public static void main(String[] args) {
        Solution15 sol = new Solution15();
        int i = sol.Solution15(123);
        System.out.println("i = " + i);
    }
}
