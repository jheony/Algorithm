import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine()), sum=0L, x=0L, p = 0L;
        String[] StudentNum = br.readLine().split(" ");
        String[] canSee = br.readLine().split(" ");

        long M = Long.parseLong(canSee[0]), S = Long.parseLong(canSee[1]);
           
        for (String i : StudentNum) {
            x = Long.parseLong(i)- M;
            p++;
            if(x > 0){
                p += x/S;
               if(x % S != 0)
                p += 1;
            }
        }
        System.out.println(p);
    }
}