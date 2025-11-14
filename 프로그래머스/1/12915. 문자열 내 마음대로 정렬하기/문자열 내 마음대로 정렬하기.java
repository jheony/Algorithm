import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        
        Arrays.sort(strings, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                // 해당 인덱스의 문자가 같으면 문자열로 사전순
                if(s1.charAt(n) == s2.charAt(n)){
                    return s1.compareTo(s2);
                }
                return s1.charAt(n) - s2.charAt(n);
            }
        });
        answer = strings;
        return answer;
    }
}