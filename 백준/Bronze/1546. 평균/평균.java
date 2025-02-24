import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            float[] arr = new float[n];
            
            StringTokenizer st = new StringTokenizer(br.readLine()); 
            
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken()); 
            }      
            Arrays.sort(arr);
            float m = arr[n-1]/100, avg=0;
            for (int i=0; i<n ; i++ ) {
                avg += arr[i]/m;
            }
            System.out.println(avg/n);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}