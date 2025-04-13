import java.util.*;
import java.lang.*;
import java.io.*;
class point{
    int x, y;
    point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class Main {
    static int n, m, cnt=0;
    static int[][] arr;
    static Queue<point> q = new LinkedList<point>();
    static boolean[][] check;
   
    private static int bfs(){
        int[] Xarr = {0, 1, 0, -1};
        int[] Yarr = {1, 0, -1, 0};
        int xn, yn, max=0;
       
        while (!q.isEmpty()) {
            point p = q.poll();  
           
            for(int i=0; i<4; i++){
                xn = p.x + Xarr[i];
                yn = p.y + Yarr[i];
               
                if(xn>=0 && xn<m && yn>=0 && yn<n
                  && arr[xn][yn] == 0){
                    arr[xn][yn] = arr[p.x][p.y] + 1;
                    q.add(new point(xn, yn));
                }
            }
        }
        if(checkZero())
            return -1;
        else{
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    if(max < arr[i][j])
                        max = arr[i][j];
                }
            }
            return max-1;
        }
    }

    private static boolean checkZero(){  // 안 익은 토마토(0) 남았는지 체크
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]==0)
                    return true;
            }
        }
        return false;
    }
   
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
       
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m][n];
        check = new boolean[m][n];
       
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j]==1)
                    q.add(new point(i, j));
            }
        }
       
        System.out.println(bfs());
    }
}