class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        // 1번 음식부터 끝까지
        for(int i=1; i<food.length; i++){
            int cnt = food[i];
            // 두 선수가 먹는 음식의 양이 같아야 함
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