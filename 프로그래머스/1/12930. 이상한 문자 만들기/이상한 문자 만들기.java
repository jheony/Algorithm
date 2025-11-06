class Solution {
    public String solution(String s) {
        String answer = "";
        int j=0;    // 단어 별 길이
        
        for(int i=0; i<s.length(); i++){
            // 한 글자 가져오기
            char c = s.charAt(i);
            // 공백이면 그대로 공백 추가
            if(c == ' '){
                j = 0;
                answer += " ";
            }
            else{
                String str = c + "";
                // 짝수 인덱스이면 대문자, 홀수면 소문자
                answer += (j++ % 2 == 0) ? str.toUpperCase() : str.toLowerCase();
            }
        }
        return answer;
    }
}