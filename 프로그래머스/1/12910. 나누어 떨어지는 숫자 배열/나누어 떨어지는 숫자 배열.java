import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int cnt = 0, idx = 0;
        for (int num : arr) {
            if (num % divisor == 0) {
                cnt++;
            }
        }
        if (cnt == 0) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[cnt];


            for (int num : arr) {
                if (num % divisor == 0) {
                    answer[idx++] = num;
                }
            }
            Arrays.sort(answer);
        }
        return answer;
    }
}