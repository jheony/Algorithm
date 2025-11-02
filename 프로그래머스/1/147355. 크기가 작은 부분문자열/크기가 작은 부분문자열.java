class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        // 문자열 길이
        int tLen = t.length();
        int pLen = p.length();
        
        // 문자열을 숫자로 변환
        Long pInt = Long.parseLong(p);
        Long tInt = 0L;
        
        String str;
        
        for(int i=0; i<tLen-pLen+1; i++){
            // p 문자열의 길이만큼 자르기  
            str = t.substring(i, i+pLen);
            // 정수 변환 후 크기 비교
            tInt = Long.parseLong(str);
            answer += (pInt >= tInt) ? 1:0;
        }
        return answer;
    }
}