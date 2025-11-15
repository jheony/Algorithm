import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int[] parent;
    
    public static boolean union(int x, int y){
        x = find(x);
        y = find(y);

        if(x == y){
            return false;
        }
            
        if(x <= y){
            parent[y] = x;
        }else{
            parent[x] = y;
        }
        return true;
    }
    
    public static int find(int x){
        if(parent[x] == x)
            return x;
        return parent[x] = find(parent[x]);
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int n = toInt(st.nextToken());
        int m = toInt(st.nextToken());

        parent = new int[n+1];
        for(int i=0; i<n+1; i++){
            parent[i] = i;
        }
        
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int num = toInt(st.nextToken());
            
            int x = toInt(st.nextToken());
            int y = toInt(st.nextToken());
            
            if(num == 0){
                union(x, y);
            }else{
                sb.append((find(x) == find(y)) ? "YES\n" : "NO\n");
            }
        }
        System.out.print(sb);
    }
    public static int toInt(String str){
        return Integer.parseInt(str);
    }
}