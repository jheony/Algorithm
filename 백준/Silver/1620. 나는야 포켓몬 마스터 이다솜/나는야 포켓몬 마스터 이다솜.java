import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        HashMap<String, Integer> poketmonName = new HashMap<>();
        HashMap<Integer, String> poketmonNum = new HashMap<>();
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i=1; i<=n; i++){
            String name = br.readLine();
            poketmonName.put(name, i);
            poketmonNum.put(i, name);
        }

        for(int i=0; i<m; i++){
            String find = br.readLine();
            if('0' <= find.charAt(0) && find.charAt(0) <= '9'){
                int findNum = Integer.parseInt(find);
                sb.append(poketmonNum.get(findNum));
            }else{
                sb.append(poketmonName.get(find));
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}