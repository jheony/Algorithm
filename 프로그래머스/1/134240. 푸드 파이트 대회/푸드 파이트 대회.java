class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<food.length; i++){
            int cnt = food[i];
            for(int j=0; j<cnt/2; j++){
                sb.append(i);
            }
        }
        answer = sb.toString();
        sb.append(0);
        answer += sb.reverse().toString();
        
        return answer;
    }
}