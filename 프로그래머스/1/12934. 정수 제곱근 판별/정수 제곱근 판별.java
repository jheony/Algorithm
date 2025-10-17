class Solution {
    public long solution(long n) {
        if(n == 1) 
            return 4;
        double sqrt = Math.sqrt(n);
        for(int i=1; i<n/2; i++){
            if(sqrt == i){
                return (long)Math.pow(i+1, 2);
            }
        }
        return -1;
    }
}