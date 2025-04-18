import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine()), x, r=2, popInt;
        Stack<Integer> s = new Stack<>();
        s.push(1);
        sb.append("+\n");
       
        for(int i=0; i<n; i++){
            x = Integer.parseInt(br.readLine());
            while (r <= x) {
                s.push(r++);
                sb.append("+\n");
            }
            popInt = s.pop();
            sb.append("-\n");
            if(popInt>x){
                sb = new StringBuilder();
                sb.append("NO");
                break;
            }
        }
        System.out.print(sb);
    }
}