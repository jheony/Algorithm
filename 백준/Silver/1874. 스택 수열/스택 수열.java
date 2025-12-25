import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        
        int n = Integer.parseInt(br.readLine());
        int inputNum, popInt = 0, number=1;

        for(int i=0; i<n; i++){
            inputNum = Integer.parseInt(br.readLine());
            
            while (number <= inputNum) {
                stack.push(number++);
                sb.append("+\n");
            }
            
            popInt = stack.pop();
            sb.append("-\n");

            if(popInt > inputNum){
                sb = new StringBuilder("NO");
                break;
            }
        }

        System.out.println(sb);
    }
}