class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] possible = {"aya", "ye", "woo", "ma"};
        String[] impossible = {"ayaaya", "yeye", "woowoo", "mama"};
        
        boolean isPossible;
        
        for(String i:babbling){
            for(int j=0; j<impossible.length; j++){
                if(i.contains(impossible[j])){
                    i = "impossible";
                }
            }
            
            for(int k=0; k<possible.length; k++){
                i = i.replace(possible[k], " ");
            }
            
            i = i.replace(" ", "");

            if(i.length() == 0){
                answer++;
            }
        }
        return answer;
    }
}