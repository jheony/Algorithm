import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), min, cost, x;
        int[][] house = new int[n][3];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<3; i++){
            house[0][i] = Integer.parseInt(st.nextToken());
        }        
        for(int i=1; i<n; i++){
            st = new StringTokenizer(br.readLine());
            min = 1001;
            for(int j=0; j<3; j++){
                x = Integer.parseInt(st.nextToken());
                house[i][j] = x + Math.min(house[i-1][(j+1)%3], house[i-1][(j+2)%3]);
            }
        }
        int total = Math.min(Math.min(house[n-1][0], house[n-1][1]), house[n-1][2]);
        System.out.print(total);
    }
}