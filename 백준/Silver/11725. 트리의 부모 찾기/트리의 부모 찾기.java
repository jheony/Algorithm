
import java.io.*;
import java.util.*;

public class Main {
    static int x, y, N;
    static boolean[] visit;         // 방문 여부 체크
    static  int[] parent;           // 부모 노드 체크
    static ArrayList<ArrayList<Integer>> arr; // 트리를 저장할 리스트

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        visit = new boolean[N+1];
        parent = new int[N+1];
        arr = new ArrayList<>();

        // 트리 생성
        for(int i=0; i<=N; i++){
            arr.add(new ArrayList<>());
        }

        // 트리 값 설정
        for(int j=0; j<N-1; j++){
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            // 각 노드에 서로 연결
            arr.get(x).add(y);
            arr.get(y).add(x);
        }

        // 부모 찾기
        DFS(1);
        // 출력
        for(int i=2; i<parent.length; i++){
            System.out.println(parent[i]);
        }
    }
    public static void DFS(int val){
        // 방문 체크
        visit[val] = true;

        // 각 노드 순회
        for(int i: arr.get(val)){
            if(!visit[i]){
                DFS(i);
                parent[i] = val;
            }
        }
    }
}