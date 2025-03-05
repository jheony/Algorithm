import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        int[] stair = new int[n+1];
        int[] dp = new int[n+1];
        
        for(int i=1; i<=n; i++){
            stair[i] =  Integer.parseInt(br.readLine());
        }
        dp[1] = stair[1];
        if(n != 1)
            dp[2] = stair[1] + stair[2];
        for(int i=3; i<=n; i++){
            dp[i] = Math.max(dp[i-3]+stair[i-1], dp[i-2])+stair[i];
        }
        bw.write(dp[n]+"");
        bw.flush();
        bw.close();
    }
}