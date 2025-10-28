class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long totalPrice = 0;
        
        // count배씩 요금 인상
        for(int i=1; i<=count; i++){
            totalPrice += price * i;
        }
        
        answer = (money > totalPrice) ? 0 : totalPrice - money;

        return answer;
    }
}