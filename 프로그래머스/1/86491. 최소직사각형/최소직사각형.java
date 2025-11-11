class Solution {
    public int solution(int[][] sizes) {
        int answer = 0, wMax = 0, hMax = 0, tmp = 0;
        // 가로, 세로 상관없이 큰 값은 큰값끼리 비교
        for(int i=0; i<sizes.length; i++){
            int w = sizes[i][0];
            int h = sizes[i][1];
            if(w > h){
                tmp = w;
                w = h;
                h = tmp;
            }
            wMax = (w > wMax) ? w : wMax;
            hMax = (h > hMax) ? h : hMax;
        }
        answer = hMax * wMax;
        return answer;
    }
}