class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int cnt = 0;
        long value = x;
        while(cnt < n){
            answer[cnt++]= value;
            value += x;
        }
        return answer;
    }
}