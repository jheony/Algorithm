import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static long hj(long a, long b){
        return (a+b)*(a-b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(hj(a,b));
        sc.close();
    }
}