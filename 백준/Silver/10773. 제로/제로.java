import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        Long sum=0L, n;
        Stack<Long> s = new Stack<>();
        
        for(int i=0; i<k; i++){
            n = Long.parseLong(br.readLine());
            
            if(n != 0L){
                s.push(n);
                sum += n;                
            }
            else{
                sum -= s.pop();
            }
        }
        System.out.println(sum);
    }
}