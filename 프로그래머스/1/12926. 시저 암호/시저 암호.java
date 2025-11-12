class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            // 소문자 or 대문자 구분
            // 마지막 글자 넘었을 때 a로 돌아오기
            if((c+n > 'z' && c >= 'a') || (c+n > 'Z' && c <= 'Z')){
                c -= 26;
            }
            // 공백은 그대로 or n만큼 밀기
            answer += (c == ' ')?" ":(char)(c+n);
        }
        return answer;
    }
}