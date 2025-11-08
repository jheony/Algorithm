import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N;
    static List<List<Integer>> list;
    static int[] parents;
    static boolean[] visited;
   
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        parents = new int[N+1];
        visited = new boolean[N+1];
       
        list = new ArrayList<>();
        for(int i=0; i<=N; i++){
            list.add(new ArrayList<>());
        }
       
        for(int i=0; i<N-1; i++){
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            list.get(n1).add(n2);
            list.get(n2).add(n1);
        }
       
        find(1);
       
        for(int i=2; i<=N; i++){
            System.out.println(parents[i]);
        }
    }

    public static void find(int currentNode){
        Queue<Integer> q = new LinkedList<>();
        q.add(currentNode);
       
        visited[currentNode] = true;
        while (!q.isEmpty()) {
            int n = q.poll();
            for(int node:list.get(n)){
                if(!visited[node]){
                    visited[node] = true;
                    parents[node] = n;
                    q.add(node);
                }
            }
        }
    }
}
