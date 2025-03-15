import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList arr = new ArrayList<Integer>();
        StringTokenizer st;
        
        Long t = Long.parseLong(br.readLine());
        String s;
        int x = 0, idx = 0;
        boolean contain=false;

        for(int i=0;i<t;i++){
            st = new StringTokenizer(br.readLine());
            s = st.nextToken();
            if(!s.equals("all") && !s.equals("empty")){
                x = Integer.parseInt(st.nextToken());
                contain = arr.contains(x);
                idx = arr.indexOf(x);
            }
            switch (s) {
                case "add":
                    if(!contain)
                        arr.add(x);
                    break;
                case "check":
                    if(contain)
                        bw.write(1+"\n");
                    else
                        bw.write(0+"\n");
                    break;
                case "toggle":
                    if(!contain)
                        arr.add(x);
                    else{
                        if(idx != -1)
                        arr.remove(arr.indexOf(x));  
                    }
                    break;
                case "remove":
                    if(idx != -1)
                        arr.remove(arr.indexOf(x));  
                    break;
                case "all":
                    arr.clear();
                    for(int k=1; k<=20; k++)
                        arr.add(k);
                    break;
                case "empty":
                    arr.clear();
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}