import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            String s = sc.next();
            System.out.println(""+s.charAt(0)+s.charAt(s.length()-1));
        }
        sc.close();
    }
}