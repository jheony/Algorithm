import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int time = 0;
        
        int n = Integer.parseInt(br.readLine());
        List<Integer> craneList = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            craneList.add(Integer.parseInt(st.nextToken()));
        }
        
        int m = Integer.parseInt(br.readLine());
        List<Integer> boxList = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            boxList.add(Integer.parseInt(st.nextToken()));
        }

        // 내림차순으로 정렬
        Collections.sort(craneList, Collections.reverseOrder());        
        Collections.sort(boxList, Collections.reverseOrder());

        // 가장 센 크레인이 가장 무거운 짐 못들면 -1
        if(craneList.get(0) < boxList.get(0)){
            time = -1;
        }else{
            while (!boxList.isEmpty()) {
                for(int i=0; i<n; i++){    // 크레인 순회
                    for(int j=0; j<boxList.size(); j++){    // 짐 순회
                        if(craneList.get(i) >= boxList.get(j)){    // 짐 들 수 있으면
                            boxList.remove(j);    // 리스트에서 짐 삭제
                            break;    // 짐 순회 종료
                        }
                    }
                }
                // 모든 크레인 돌면 시간 증가
                time++;
            }
        }
        System.out.println(time);
    }
}