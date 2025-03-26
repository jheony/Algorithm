import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t =sc.nextInt(), x;
        int arr[] = new int[3];
        for(int i=1;i<=t;i++){
            sb.append("Scenario #"+i+":\n");
            for(int j=0; j<3; j++)
                arr[j] = sc.nextInt();

            Arrays.sort(arr);
            x  = arr[1]*arr[1] + arr[0]*arr[0]; 
            if(arr[2]*arr[2] == x)
                sb.append("yes\n\n");
            else
                sb.append("no\n\n");
        }
        System.out.print(sb);
    }
}