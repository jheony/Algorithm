class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] arr = new int[number+1];
        
        for(int i=1; i<=number; i++){
            // 약수 개수 구하기
            for(int j=1; j*j<=i; j++){
                if(i % j == 0){
                    arr[i]++;
                    if(j != i/j){
                        arr[i]++;
                    }
                }
            }
            // 제한 공격력을 넘으면 협약한 공격력으로 설정
            if(arr[i] > limit){
                arr[i] = power;
            }
            // 철 무게 합산
            answer += arr[i];
        }
        return answer;
    }
}