class Solution { // a = 마트 제출, b = 받는 새 콜라, n = 소유한 빈 병
    public int solution(int a, int b, int n) {
        int answer = 0;
        int newOne = 0;
        int cnt=0;
        while(n >= a){
            // 마트에 제출
            cnt = n / a;

            // 받은 콜라 수
            newOne = b * cnt;
            
            // 남은 빈 병 수
            n = (n % a) + newOne;
            
            answer += newOne;
        }
        return answer;
    }
}