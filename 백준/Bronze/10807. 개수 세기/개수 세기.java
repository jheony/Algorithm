import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        int cnt = 0;
        for(int i=0; i<n; i++){
            if (arr[i]==v){
                cnt += 1;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}