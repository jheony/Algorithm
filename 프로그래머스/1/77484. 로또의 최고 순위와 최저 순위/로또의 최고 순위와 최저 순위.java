class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] win = {6, 5, 4, 3, 2};
        
        int cnt = 0;
        int unknown = 0;
        
        for(int i=0; i<win_nums.length; i++){
            for(int j=0; j<lottos.length; j++){
                if(win_nums[i] == lottos[j]){
                    cnt++;
                }    
            }
            
            if(lottos[i] == 0){
                unknown++;
            }
        }
        if(cnt <= 1 ){
            answer[1] = 6;
        }
        if(cnt+unknown <= 1){
            answer[0] = 6;
        }
        for(int i=0; i<win.length; i++){
            if(win[i] == cnt+unknown){
                answer[0] = i+1;
            }
            if(win[i] == cnt){
                answer[1] = i+1;
            }
        }
        
        return answer;
    }
}