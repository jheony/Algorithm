class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] require = new boolean[n];
        for(int i: section){
            require[i-1] = true;
        }
        for(int i=0; i<n; i++){
            if(require[i]){
                for(int j=0; j<m; j++){
                    if(j+i >= n) break;
                    require[j+i] = false;
                }
                answer++;
            }
        }
        return answer;
    }
}