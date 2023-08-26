package org.example.programmers.day03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution5 {

//    arr	    return
//    [4,3,2,1]	[4,3,2]
//    [10]	    [-1]
    public int[] solution(int[] arr) {
        if(arr.length <= 1) return new int[]{-1};
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(i -> i != min).toArray();
//        List<Integer> collect = Arrays.stream(arr)
//                .boxed()
//                .collect(Collectors.toList());
//        if(collect.size() > 1) {
//            int min = Arrays.stream(arr)
//                    .reduce(Integer::min)
//                    .getAsInt();
//            for (int i = 0; i < collect.size(); i++) {
//                if(collect.get(i) == min) {
//                    collect.remove(i);
//                }
//            }
//        } else {
//            collect.clear();
//            collect.add(-1);
//        }
//        return collect;
    }

    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        int[] arr = {10};
    }
}
