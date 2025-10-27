import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        String[] answerArr = new String[len];
        
        for(int i=0; i<len; i++){
            answerArr[i] = ""+s.charAt(i);
        }
        Arrays.sort(answerArr);
        for(int j=len-1; j>=0; j--){
            answer += answerArr[j];
        }
        return answer;
    }
}