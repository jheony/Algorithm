import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        for(int i =0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int result=0, max=0, maxSum;
        // 치킨 종류 조합 별 최대 만족도 구하기
        for(int i=0; i<m-2; i++){
            for(int j=i+1; j<m-1; j++){
                for(int k=j+1; k<m; k++){
                    maxSum = 0;
                    
                    for(int p=0; p<n; p++){
                        max = Math.max(arr[p][i],arr[p][j]);
                        max = Math.max(max, arr[p][k]);
                        maxSum += max;
                    }
                    result = Math.max(result, maxSum);
                }
            }
        }
        System.out.print(result);
    }
}