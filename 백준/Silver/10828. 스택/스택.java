import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int num, idx=1;

        int[] stack = new int[n+1];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            switch (order) {
                case "push":
                    num = Integer.parseInt(st.nextToken());
                    stack[idx++] = num;
                    break;
                case "pop":
                    if(idx == 1){
                        sb.append("-1\n");
                    }else{
                        sb.append(stack[--idx]).append("\n");
                    }
                    break;
                case "size":
                    sb.append(idx-1).append("\n"); //
                    break;
                case "empty":
                    sb.append((idx == 1)?1:0).append("\n");
                    break;
                case "top":
                    if(idx == 1){
                        sb.append("-1\n");
                    }else{
                        sb.append(stack[idx-1]).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}