import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int n, cnt=0, totalCnt=0;
    static boolean visited[][];
    static char arr[][];
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new char[n][n];
        visited = new boolean[n][n];
        for (int i=0; i<n; i++){
            arr[i] = br.readLine().toCharArray(); 
        }
        List<Integer> homeCnt = new ArrayList<>();
        
        for (int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] == '1' && !visited[i][j]){
                    cnt=0;
                    dfs(i, j);
                    totalCnt++;
                    homeCnt.add(cnt);
                }
            }
        }
        
        System.out.println(totalCnt);
        
        Collections.sort(homeCnt);
        for(int i:homeCnt){
            System.out.println(i);
        }
    }
    public static void dfs(int x, int y){
        visited[x][y] = true;
        cnt++;
        
        int[] Xarr = {1, 0, -1, 0};
        int[] Yarr = {0, -1, 0, 1};

        for(int i=0; i<4; i++){
            int nextX = x + Xarr[i];
            int nextY = y + Yarr[i];
            
            if(0<=nextX && nextX<n && 0<=nextY&&nextY<n){
                if(arr[nextX][nextY] == '1' && !visited[nextX][nextY]){
                    dfs(nextX, nextY);
                }
            }
        }
    }
}