class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i=left; i<=right; i++){
            int cnt = 0;    // i의 약수의 갯수 초기화
            
            for(int j=1; j<=i; j++){
                if(i%j == 0){
                   cnt++;   // 약수의 개수 구하기
                }
            }
            // 약수의 개수가 짝수인 수는 더하고 홀수인 수는 뻬기
            answer += (cnt % 2 == 0) ? i : -1*i; 
        }
        return answer;
    }
}