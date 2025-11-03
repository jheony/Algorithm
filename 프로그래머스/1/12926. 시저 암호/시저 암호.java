class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if((c+n > 'z' && c >= 'a') || (c+n > 'Z' && c <= 'Z')){
                c -= 26;
            }
            answer += (c == ' ')?" ":(char)(c+n);
        }
        return answer;
    }
}