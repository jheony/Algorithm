import java.io.*;
import java.util.*;

public class Main {
    static List<Integer> heap;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        heap = new ArrayList<>();
        heap.add(0);

        for(int i=0; i<n; i++){
            int x = Integer.parseInt(br.readLine());
            if(x == 0){
                System.out.println(delete());
            }else{
                insert(x);
            }
        }
    }
    static public void insert(int val) {
        // 마지막노드에 추가
        heap.add(val);
        int curIdx = heap.size() - 1;

        // 루트가 아니거나 부모가 더 작으면
        while (curIdx > 1 && heap.get(curIdx / 2) < val) {

            // 부모 노드랑 비교
            if (heap.get(curIdx / 2) < val) {
                // 자식이 더 크면 바꾸기
                int temp = heap.get(curIdx / 2);
                heap.set(curIdx / 2, val);
                heap.set(curIdx, temp);
                curIdx /= 2;
            }
        }
    }

    static public int delete() {
        if (heap.size() == 1) {
            return 0;
        }
        // 가장 큰 값 저장(루트)
        int root = heap.get(1);

        // 마지막 노드를 루트에 넣기
        heap.set(1, heap.get(heap.size()-1));
        heap.remove(heap.size()-1);

        int curIdx = 1;
        // 자식 노드가 없을 때까지
        while (curIdx * 2 <= heap.size()-1) {
            int left = curIdx * 2;
            int right =curIdx * 2 + 1;
            
            // 왼쪽 자식은 무조건 있으니 large에 넣기
            int large = left;
            // 만약 오른쪽 자식이 있으면 둘 중 큰 값의 인덱스를 large에 저장
            if (right <= heap.size()-1 && heap.get(right) > heap.get(left)) {
                large = right;
            }
            // 방금 찾은 large가 현재값보다 작으면 그대로
            if (heap.get(large) < heap.get(curIdx)){
                return root;
            }
            // 크면 바꾸기
            int temp = heap.get(curIdx);
            heap.set(curIdx, heap.get(large));
            heap.set(large, temp);

            curIdx = large;
        }
        return root;
    }
}
