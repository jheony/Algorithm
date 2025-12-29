import java.util.*;

class Solution {
    public static boolean[] reserved;
    public static int answer;
    
    public int solution(int n, int[] lost, int[] reserve) {
        // 기본 최대: 총인원 - 도난 당한 인원
        answer = n - lost.length;
        
        // 여벌 체육복 갖고 있는 사람
        reserved = new boolean[n+1];
        for(int i: reserve){
            reserved[i] = true;
        }
                Arrays.sort(lost);

        // 본인 or 전후 번호가 가지고 있는지 확인
        for(int i=0; i<lost.length; i++){
            if(check(lost[i])){
                lost[i] = -1;
            } 
            
        }
        for(int i:lost){
            if((1 < i) && check(i-1)) continue;
            if((0 < i) && (i < n) && check(i+1)) continue;
        }        
        return answer;
    }
    
    public static boolean check(int x){
        if(reserved[x]){
            reserved[x] = false;
            answer++;
            return true;
        }
        return false;
    }
}