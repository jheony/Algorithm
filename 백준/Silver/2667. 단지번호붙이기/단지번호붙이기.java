import java.util.*;
import java.lang.*;
import java.io.*;

class point{
    int x;
    int y;
    point(int nx, int ny){
        this.x = nx;
        this.y = ny;
    }
}
class Main {
    static int n;
    static int[][] arr;
    static boolean[][] check;
    static ArrayList<Integer> cnt;
    static Queue<point> q;
    
    public static void bfs(int nx, int ny){
        q = new LinkedList<>();
        q.add(new point(nx, ny));
        check[nx][ny] = true;
        
        int[] Xarr = {0, 1, 0, -1};
        int[] Yarr = {1, 0, -1, 0};
        int xnext, ynext, c=0;
        
        while (!q.isEmpty()) {
            point p = q.poll();
            c++;
            
            for(int i=0; i<4; i++){
                xnext = p.x + Xarr[i];
                ynext = p.y + Yarr[i];

                if(xnext >= 0 && ynext >= 0 && xnext < n && ynext < n 
                   && !check[xnext][ynext] && arr[xnext][ynext] == 1){
                    
                    q.add(new point(xnext, ynext));
                    check[xnext][ynext] = true;
                }
            }
        }
        cnt.add(c);
    }
    
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        check = new boolean[n][n];
        cnt = new ArrayList<>();
        String s;
        
        for(int i=0; i<n; i++){
            s = br.readLine();
            
            for(int j=0; j<n; j++){
                arr[i][j] = s.charAt(j)-'0';
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]==1 && !check[i][j])
                    bfs(i, j);
            }
        }

        Collections.sort(cnt);
        sb.append(cnt.size() +"\n");
        for(int i:cnt){
            sb.append(i+"\n");
        }
        System.out.print(sb);
    }
}