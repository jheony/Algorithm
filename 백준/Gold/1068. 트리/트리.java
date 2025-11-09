import java.io.*;
import java.util.*;
public class Main {
    static int N, root, delete, leaf=0;
    static List<List<Integer>> list;
    static boolean[] visit;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        String[] nodes = br.readLine().split(" ");
        visit = new boolean[N+1];
        list = new ArrayList<>();

        // 트리 생성
        for (int i = 0; i < N; i++) {
            list.add(new ArrayList<>());
        }

        // 노드 주입
        for (int i = 0; i < N; i++) {
            int node = Integer.parseInt(nodes[i]);
            // 입력이 -1이면 루트
            if (node == -1) {
                root = i;
            } else {
                // 노드끼리 서로 연결
                list.get(i).add(node);
                list.get(node).add(i);
            }
        }
        // 삭제할 노드 입력
        delete = Integer.parseInt(br.readLine());
        // 삭제할 노드가 루트면 0 출력
        if(delete == root){
            System.out.println(0);
        }else {
            // 아니면 DFS 호출
            DFS(root);
            // 리프 노드 개수 출력
            System.out.println(leaf);
        }
    }

    public static void DFS(int val) {
        // 노드 방문 체크
        visit[val] = true;
        // 노드 개수 체크
        int cnt = 0;
        for(int i: list.get(val)){
            // 방문하지 않았으며 삭제할 노드가 아니라면 재귀
            if(!visit[i] && i != delete){
                // 노드 개수 증가
                cnt++;
                DFS(i);
            }
        }
        // 노드 개수가 0이면 리프노드 개수 증가
        if(cnt == 0){
            leaf++;
        }
    }
}