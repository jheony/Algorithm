class Solution {
    public String solution(String s) {
        String answer = "";
        int j=0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == ' '){
                j = 0;
                answer += " ";
            }else{
                String str = c+"";
                answer += (j++ % 2 == 0) ? str.toUpperCase() : str.toLowerCase();
            }
        }
        return answer;
    }
}