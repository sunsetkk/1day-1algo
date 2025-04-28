// 문제 제목: [02 배열 제어하기]
// 링크: [문제 링크]

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        String arrStr = sc.nextLine();
        String[] s = arrStr.split(" ");

        // 풀이 로직
        int[] arr = new int[s.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);
        Arrays.sort(result, Collections.reverseOrder());


        // 출력
        System.out.println(Arrays.toString(result));
    }
}