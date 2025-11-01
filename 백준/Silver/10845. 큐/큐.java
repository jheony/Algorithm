import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> Q = new LinkedList<>();
        int n = Integer.parseInt(br.readLine()), x, last=0;
        String s;
        StringBuilder sb = new StringBuilder();
       
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            s = st.nextToken();
            switch (s) {
                case "push":
                    x = Integer.parseInt(st.nextToken());
                    Q.add(x);      
                    last = x;
                    break;
                case "pop":
                    if(Q.isEmpty())
                        sb.append("-1"+"\n");
                    else
                        sb.append(Q.poll()+"\n");
                    break;
                case "size":
                    sb.append(Q.size()+"\n");
                    break;
                case "empty":
                    if(Q.isEmpty())
                        sb.append("1"+"\n");
                    else
                        sb.append("0"+"\n");
                    break;
                case "front":
                    if(Q.isEmpty())
                        sb.append("-1"+"\n");
                    else
                        sb.append(Q.peek()+"\n");
                    break;
                case "back":
                    if(Q.isEmpty())
                        sb.append("-1"+"\n");
                    else
                        sb.append(last+"\n");                    
                    break;
            }
        }
        System.out.print(sb);
    }
}