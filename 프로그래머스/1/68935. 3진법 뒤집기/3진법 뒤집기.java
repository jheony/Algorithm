class Solution {
    public int solution(int n) {
        int answer = 0;
        long number = 0;
        // 앞뒤 반전 3진법 구하기 
        while(n>0){
            int x = n % 3;
            n /= 3;
            number *= 10;
            number += x;
        }
        // 뒤집힌 3진법을 10진법으로 표현
        int i=0;
        while(number > 0){
            long mod = number % 10;
            number /= 10;
            answer += mod * Math.pow(3, i++);
        }
        return answer;
    }
}