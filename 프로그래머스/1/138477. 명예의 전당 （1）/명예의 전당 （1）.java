import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int len = score.length;
        int[] answer = new int[len];
        int[] arr = new int[k];
        int min = 2001;
        int j=0;
        
        for(int i=0; i<len; i++){
            if(i < k){
                // k일까지는 모두가 명예의 전당
                arr[i] = score[i];
                min = Math.min(score[i], min);
                answer[j++] = min;
                continue;
            }
            Arrays.sort(arr);
            
            // 새로운 가수 명예의 전당에 올리기
            if(min < score[i]){
                // 최하위 점수를 새로운 점수로 바꾸기
                arr[0] = score[i];
                Arrays.sort(arr);
            }
            
            // 최하위점 구하기
            min = arr[0];
            answer[j++] = min;
        }
        return answer;
    }
}