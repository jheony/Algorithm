class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = n*m / answer[0];
        return answer;
    }
    public int gcd(int n, int m){
        int tmp;
        while(m>0){
            tmp = m;
            m = n % m;
            n = tmp;
        }
        return n;
    }
}