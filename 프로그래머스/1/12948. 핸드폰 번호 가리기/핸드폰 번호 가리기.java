class Solution {
    public String solution(String phone_number) {
        String answer = "*";
        int len = phone_number.length();
        answer = answer.repeat(len-4) + phone_number.substring(len-4,len);
        return answer;
    }
}