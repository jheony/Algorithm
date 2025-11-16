import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int[] parent;
    
    public static void union(int x, int y){
        x = find(x);
        y = find(y);

        if(x == y){
            return;
        }
        if(x>y){
            parent[y] = x;
        }else{
            parent[x] = y;
        }
    }

    public static int find(int x){
        if(x == parent[x]){
            return x;
        }else{
            return parent[x] = find(parent[x]);
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int x;

        parent = new int[n+1];
        for(int i=0; i<=n; i++){
            parent[i] = i;
        }
        
        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=n; j++){
                if(i == j){
                    break;
                }
                x = Integer.parseInt(st.nextToken());
                if(x == 1){
                    union(i, j);
                }
            }
        }
        boolean isPossible = true;
        
        st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        int findParent = find(x);
        
        for(int i=0; i<m-1; i++){
            x = Integer.parseInt(st.nextToken());
            if(find(x) != findParent){
                isPossible = false;
            }
        }
        System.out.println(isPossible?"YES":"NO");
    }
}