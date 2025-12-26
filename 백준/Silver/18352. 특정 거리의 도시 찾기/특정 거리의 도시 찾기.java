import java.util.*;
import java.lang.*;
import java.io.*;

    // 단방향으로 연결한 그래프 세팅
    // x에서 시작한 모든 곳에 거리 값 넣기(bfs)
    // 정확히 k인 곳 ++
    // if k==0? answer = -1;

class Main {
    static int n, m, k, x;
    static List<Integer>[] city;
    static int[] d;
    static boolean[] visited;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());

        city = new ArrayList[n+1];
        d = new int[n+1];
        visited = new boolean[n+1];

        for(int i=1; i<=n; i++){
            city[i] = new ArrayList<>();
        } 

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            city[a].add(b);
        }
        
        bfs(x);
        List<Integer> possible = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(d[i] == k){
                possible.add(i);
            }
        }
        Collections.sort(possible);

        if(possible.size() == 0){
            System.out.println(-1);
            return;
        }
        
        for(int i:possible){
            System.out.println(i);
        }
    }


    public static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int next = q.poll();
            for(int i : city[next]){
                if(!visited[i]){
                    d[i] = (d[i] == 0) ? d[next] + 1 : d[i];
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }

    }
}