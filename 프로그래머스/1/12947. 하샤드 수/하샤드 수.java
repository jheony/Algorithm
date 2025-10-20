class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0, num=x;
        while(x>0){
            sum += x%10;
            x /= 10;
        }
        answer = num%sum == 0?true:false;
        return answer;
    }
}