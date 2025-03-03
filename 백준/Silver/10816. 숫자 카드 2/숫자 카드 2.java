import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Long mL, nL;
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Long, Long> haveNum = new HashMap<>();
        for (int i=0; i<n; i++) {
            nL = Long.parseLong(st.nextToken());
            if(haveNum.get(nL) == null)
                haveNum.put(nL,1L);
            else{
                Long x = haveNum.get(nL)+1L;
                haveNum.put(nL, x);
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            mL = Long.parseLong(st.nextToken());
            if(haveNum.get(mL) == null)
                bw.write("0 ");
            else
                bw.write(haveNum.get(mL) +" ");
        }
        bw.flush();
        bw.close();
    }
}