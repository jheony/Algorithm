import java.util.*;
import java.lang.*;
import java.io.*;

class Main {    
    static boolean[] visit;
    static int[][] arr;
    static int n, m, cnt = 0;
    
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x, y;
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n+1][n+1];
        visit = new boolean[n+1];
        
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            
            arr[x][y] = arr[y][x] = 1;
        }
        for(int i=1; i<=n; i++){
            if(!visit[i]){
                dfs(i);
                cnt++;
            }
        }
        System.out.print(cnt);
    }
    
    public static void dfs(int num){
        if(visit[num])
            return;
        else{
            visit[num] = true;
            for(int i=1; i<=n; i++){
                if(arr[num][i] == 1)
                    dfs(i);
            }    
        }
    }
}