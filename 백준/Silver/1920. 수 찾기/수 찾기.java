import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int x, start, end, mid, m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        for(int i=0; i<m; i++){
            boolean tf = false;
            x = Integer.parseInt(st.nextToken());
            start = 0;
            end = n-1;
            while (start<=end) {
                mid = (start + end)/2;
                if(arr[mid] == x){
                    tf = true;
                    break;
                }
                else if(arr[mid] >= x)
                    end = mid -1;
                else if(arr[mid] < x)
                    start = mid +1;
            }
            if(tf)
               bw.write("1\n");
            else
               bw.write("0\n");
                
        }
        bw.flush();
        bw.close();
    }
}