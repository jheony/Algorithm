class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        int sum = 0;
        int len = nums.length;
        for(int i=0; i<len-2; i++){
            for(int j=i+1; j<len-1; j++){
                for(int k=j+1; k<len; k++){
                    sum = nums[i] + nums[j] + nums[k];
                    if(!prime(sum)) continue;
                    answer++;
                }
            }
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

        return answer;
    }
    public static boolean prime(int x){
        for(int i=2; i<x; i++){
            if(x%i == 0) return false;
        }
        return true;
    }
}