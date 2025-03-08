import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(), k = sc.nextInt(), cnt=0;
        int[] arr =new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]<=k){
                cnt += k / arr[i];
                k = k % arr[i];
            }
        }
        System.out.print(cnt);
    }
}