import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int len = arr.length;
        int min=Integer.MAX_VALUE;
        
        if(len == 1){
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        
        for(int i:arr){
            if(i < min){
                min = i;
            }
        }
        answer = new int[len-1];
        int j=0;
        for(int i=0; i<len; i++){
            if(arr[i] != min){
                answer[j++] = arr[i];            
            }
        }
        return answer;
    }
}