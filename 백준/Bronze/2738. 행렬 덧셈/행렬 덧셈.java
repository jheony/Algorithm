import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] A = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                A[i][j] = sc.nextInt();
            }
        }            
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                A[i][j] += sc.nextInt();
                System.out.print(A[i][j]+" ");
            }System.out.println();   
        }
        sc.close();
    }
}