import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x[] = new int[n];
        int y[] = new int[n];
        int cnt[] = new int[n];
        for(int i=0; i<n; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n;j++){
                    if(x[i] < x[j] && y[i] < y[j])
                        cnt[i] += 1;
                    else if(x[i] > x[j] && y[i] > y[j])
                        cnt[j] += 1;
            }
        }
       for(int i=0; i<n; i++){
           if(i != n-1)
                System.out.print(cnt[i]+1+" ");
           else
               System.out.print(cnt[i]+1);
       }
    }
}