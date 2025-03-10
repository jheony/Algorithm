import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int node, line, x, y, cnt=0;
    static boolean[] check;
    static int[][] arr;
    
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        node = Integer.parseInt(br.readLine());
        line = Integer.parseInt(br.readLine());
        
        arr = new int[node+1][node+1];
        check = new boolean[node+1];
        for(int i=0; i<line; i++){
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            
            arr[x][y] = arr[y][x] = 1;
        }
        virus(1);

        System.out.print(cnt-1);
    }
    public static void virus(int start){
        check[start] = true;
        cnt++;
        
        for(int i=0; i<=node; i++){
            if(arr[start][i] == 1 && !check[i])
                virus(i);
        }
    }
}