class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = n + "";
        int len = str.length();
        long[] arr = new long[len];
        int idx = 0;
        while (n > 0) {
            arr[idx++] = n % 10;
            n /= 10;
        }
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < len; j++) {
                if (arr[j] == i) {
                    answer *= 10;
                    answer += arr[j];
                }
            }
        }
        return answer;
    }
}