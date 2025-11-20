import java.util.*;
// 문자열을 돌면서 각 문자가 마지막으로 나온 위치 저장
class Solution {
    public int[] solution(String s) {
        int len = s.length();
        int[] answer = new int[len];
        HashMap<String, Integer> strMap = new HashMap<>();
        
        for(int i=0; i<len; i++){
            String c = s.charAt(i)+"";
            // 각 문자의 마지막 위치 별 연산
            answer[i] = (strMap.get(c) == null) ? -1 : i - strMap.get(c);
            strMap.put(c, i);
        }
        return answer;
    }
}