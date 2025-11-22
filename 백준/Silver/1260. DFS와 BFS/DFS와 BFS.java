import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int n, m, v;
    static List<Integer>[] adj;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 정점 개수
        m = Integer.parseInt(st.nextToken()); // 간선 개수
        v = Integer.parseInt(st.nextToken()); // 시작 정점 번호

        visited = new boolean[n+1];
        adj = new ArrayList[n+1];
        for(int i=0; i<=n; i++){
            adj[i] = new ArrayList<>();
        }
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            adj[x].add(y);
            adj[y].add(x);
        }
		// 방문할 정점이 여러 개일 경우, 번호가 작은것 먼저 방문
        for(int i=0; i<=n; i++){
            Collections.sort(adj[i]);
        }
        
        dfs(v);

        sb.append("\n");
        visited = new boolean[n+1];
        bfs(v);
        
        System.out.print(sb);
    }

    public static void dfs(int n){
        visited[n] = true;
        sb.append(n).append(" ");
        
        for(int i:adj[n]){
            if(!visited[i]){
                dfs(i);
            }
        }
    }

    public static void bfs(int n){
        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        visited[n] = true;
        
        while (!q.isEmpty()) {
            int x = q.poll();
            sb.append(x).append(" ");
            
            for(int i:adj[x]){
                if(!visited[i]){
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }    
}