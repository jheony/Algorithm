class Solution {
    public int solution(int n) {
        int answer = 0;
        long a = 0L;
        long b = 1L;
        
        long tmp = 0;
        for(int i=2; i<=n; i++){
            tmp = (a+b % 1234567L);
            a = b;
            b = tmp;
        }
        
        answer = (int) (tmp % 1234567L);
        
        return answer;
    }
}