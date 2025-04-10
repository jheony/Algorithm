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
    public static long distance(point p1, point p2){
        return 1L*(p1.x-p2.x)*(p1.x-p2.x)+1L*(p1.y-p2.y)*(p1.y-p2.y);
    }
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            StringBuilder sb = new StringBuilder();
            point[] xy = new point[4];
            for(int j=0; j<4; j++){
                st = new StringTokenizer(br.readLine());
                xy[j] = new point( Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            }
            long[] dis = new long[6];
            int idx=0;
            for(int k=0; k<4; k++){
                for(int j=k+1; j<4; j++){
                    dis[idx++] = distance(xy[k], xy[j]);
                }
            }
            Arrays.sort(dis);
            if(dis[0] == dis[1] && dis[1] == dis[2] && dis[2] == dis[3] 
               && dis[4] == dis[5])
                sb.append(1+"\n");
            else
                sb.append(0+"\n");
            System.out.print(sb);
        }
    }
}