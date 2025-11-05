class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb;
        String[] eng = {"zero", "one", "two", "three", "four",
                        "five", "six", "seven", "eight", "nine"};
        for(int i=0; i<=9; i++){
            if(s.contains(eng[i])){ 
                s = s.replaceAll(eng[i], i+"");
            }
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}