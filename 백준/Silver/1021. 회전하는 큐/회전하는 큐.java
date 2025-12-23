import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int findNum, idx, cnt=0;

        List<Integer> dequeue = new ArrayList<>();
        // a1, a2, ... , aN
        for(int i=1; i<=n; i++){
            dequeue.add(i);
        }

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<m; i++){
            findNum = Integer.parseInt(st.nextToken());

            // 찾을 수의 인덱스 파악
            idx = dequeue.indexOf(findNum);

            int size = dequeue.size();
            // 연산의 최솟값을 구하기 위해 인덱스에서 가까운 회전 방향 선택
            if(idx <= size/2){
                for(int j=0; j<idx; j++){
                    // 왼쪽으로 회전: a2, a3, ... , aN, a1
                    dequeue.add(dequeue.remove(0));
                    cnt++;
                }
            }else{
                for(int j=0; j<size-idx; j++){
                    // 오른쪽으로 회전: aN, a1, a2, ... , aN-1
                    dequeue.add(0, dequeue.remove(size-1));
                    cnt++;
                }
            }
            dequeue.remove(0);
        }
        System.out.println(cnt);
    }
}
