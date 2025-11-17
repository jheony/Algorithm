import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        int len = numbers.length;
        
        // 중복 허용 X
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0; i<len-1; i++){
            for(int j=i+1; j<len; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }
        answer = new int[set.size()];
        int i=0;
        for(int num:set){
            answer[i++] = num;
        }
        // Set은 순서가 없기에 조건에 맞게 정렬해줘야 함
        Arrays.sort(answer);
        return answer;
    }
}