class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb;
        String[] eng = {"zero", "one", "two", "three", "four",
                        "five", "six", "seven", "eight", "nine"};
        for(int i=0; i<=9; i++){
            // 입력받은 문자열에 영단어가 포함되어 있다면 
            if(s.contains(eng[i])){ 
                // 숫자로 변환
                s = s.replaceAll(eng[i], i+"");
            }
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}