import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), x, start, end, sum;
        int[] arr = new int[n+1];
        
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n;i++){
            x = Integer.parseInt(st.nextToken());
            arr[i] = arr[i-1] + x;
        }
        for(int j=0; j<m; j++){
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            
            sb.append(arr[end]-arr[start-1]+"\n");
        }
        System.out.print(sb);
    }
}