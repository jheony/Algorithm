import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[][] student = {
            { 1, 2, 3, 4, 5 },
            { 2, 1, 2, 3, 2, 4, 2, 5 },
            { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 }
        };
        
        Map<Integer, Integer> scores = new HashMap<>();
        
        for(int i=0; i<3; i++){
            scores.put(i, 0);
        }
        
        for(int i=0; i<answers.length; i++){
            if(student[0][i%5] == answers[i]){
                scores.put(0, scores.get(0)+1);
            }
            if(student[1][i%8] == answers[i]){
                scores.put(1, scores.get(1)+1);
            }            
            if(student[2][i%10] == answers[i]){
                scores.put(2, scores.get(2)+1);
            }
        }
        
        List<Integer> sortScore = new ArrayList<>(scores.keySet());
        sortScore.sort((o1, o2) -> scores.get(o2).compareTo(scores.get(o1)));

        int max = Collections.max(scores.values());
        List<Integer> top = new ArrayList<>();
        
        for(int i : scores.keySet()){
            int score = scores.get(i);
            if(score >= max){
                top.add(i);
                max = score;
            }
        }
        
        int[] answer = new int[top.size()];
        for(int i=0; i<top.size(); i++){
            answer[i] = top.get(i)+1;
        }
        return answer;
    }
}