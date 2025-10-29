class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int len = s.length();
        for(int i=0; i<len; i++){
            char c = s.charAt(i);
            if('0' > c || c > '9'){
                answer = false;
            }
        }
        if(len != 4 && len != 6){
            answer = false;
        }
        return answer;
    }
}