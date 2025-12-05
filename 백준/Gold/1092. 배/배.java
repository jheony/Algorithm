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

        Collections.sort(craneList, Collections.reverseOrder());
        
        Collections.sort(boxList, Collections.reverseOrder());

        if(craneList.get(0) < boxList.get(0)){
            time = -1;
        }else{
            while (!boxList.isEmpty()) {
                for(int i=0; i<n; i++){
                    for(int j=0; j<boxList.size(); j++){
                        if(craneList.get(i) >= boxList.get(j)){
                            boxList.remove(j);
                            break;
                        }
                    }
                }
                time++;
            }
        }
        System.out.println(time);
    }
}