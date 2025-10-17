class Solution {
    public int solution(String s) {
        int answer = 0;
        char c = s.charAt(0);
        int sign = 1, i = 0;
        if (c == '-') {
            sign *= -1;
            i = 1;
        } else if (c == '+') {
            i = 1;
        }
        for (; i < s.length(); i++) {
            c = s.charAt(i);
            answer *= 10;
            answer += c - '0';
        }
        return answer * sign;
    }
}