import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int n, m, cnt=0;
    static List<Integer>[] adj;
    static boolean visited[];
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        adj = new ArrayList[n+1];
        visited = new boolean[n+1];
        for(int i=0; i<=n; i++){
            adj[i] = new ArrayList<>();
        }

        for(int j=0; j<m; j++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            adj[x].add(y);
            adj[y].add(x);
        }
        dfs(1);
        System.out.println(cnt-1);
    }
    
    static void dfs(int x){
        visited[x] = true;
        cnt++;
        for(int i: adj[x]){
            if(!visited[i]){
                dfs(i);
            }
        }
    }
}