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

        while (curIdx > 1 && heap.get(curIdx / 2) > val) {

            // 부모 노드랑 비교
            if (heap.get(curIdx / 2) > val) {
                // 부모가 더 크면 바꾸기
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
        // 가장 작은 값 저장(루트)
        int root = heap.get(1);

        // 마지막 노드를 루트에 넣기
        heap.set(1, heap.get(heap.size()-1));
        heap.remove(heap.size()-1);

        int curIdx = 1;
        // 자식 노드가 없을 때까지
        while (curIdx * 2 < heap.size()) {
            int left = curIdx * 2;
            int right = curIdx * 2 + 1;

            // 왼쪽 자식은 무조건 있으니 small에 넣기
            int small = left;

            // 만약 오른쪽 자식이 있으면 둘 중 작은 값의 인덱스를 small에 저장
            if (right < heap.size() && heap.get(right) < heap.get(left)) {
                small = right;
            }

            // 방금 찾은 small이 현재값보다 작으면 그대로
            if (heap.get(small) > heap.get(curIdx)){
                return root;
            }

            // 작으면 바꾸기
            int temp = heap.get(curIdx);
            heap.set(curIdx, heap.get(small));
            heap.set(small, temp);

            curIdx = small;
        }
        return root;
    }
}