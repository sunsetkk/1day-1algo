// 문제 제목: [03 두 개 뽑아서 더하기]
// 링크: [https://school.programmers.co.kr/learn/courses/30/lessons/68644]

import java.util.*;

public class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new TreeSet<>();

        for(int i=0; i < numbers.length - 1; i++){
            for(int j=i+1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        int[] result = new int[set.size()];
        int index = 0;
        for (int i : set) {
            result[index++] = i;
        }

        return result;
    }
}