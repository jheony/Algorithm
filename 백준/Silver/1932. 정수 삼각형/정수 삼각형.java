import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), x, max;
        StringTokenizer st =  new StringTokenizer(br.readLine());
        int[][] dp = new int[n+1][n];
        max = dp[0][0] = Integer.parseInt(st.nextToken());
       
        for(int i=1; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<=i;j++){
                x = Integer.parseInt(st.nextToken());
                if(j==0){
                  dp[i][j] = dp[i-1][j] + x;  
                } 
                else if(j==i){
                    dp[i][j] = dp[i-1][j-1] + x;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + x;
                }
                if(dp[i][j]>=max)
                    max = dp[i][j];
            }
        }
        System.out.print(max);
    }
}