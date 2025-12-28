class Solution {
    public String solution(String X, String Y) {
        // 1부터 9까지 숫자가 몇개 나왔는지 체크
        int[] xInt = new int[10];
        int[] yInt = new int[10];
        
        for(int i=0; i<X.length(); i++){
            xInt[Integer.parseInt(X.substring(i, i+1))]++;
        }
        
        for(int i=0; i<Y.length(); i++){
            yInt[Integer.parseInt(Y.substring(i, i+1))]++;
        }
        StringBuilder answerSb = new StringBuilder();

        // 둘 중 더 작은 개수만큼 추가(짝꿍수)
        for(int i=9; i>=0; i--){
            for(int j=0; j<Math.min(xInt[i], yInt[i]); j++){
                answerSb.append(i);
            }
        }
        
        String answer = answerSb.toString();
        
        // 짝꿍이 없거나 0일때
        if(answer.length() == 0){
            return "-1";
        }
        if(answer.charAt(0) == '0'){
            return "0";
        }
        
        return answer;
    }
}