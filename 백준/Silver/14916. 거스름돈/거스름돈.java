import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        
        if(n == 1){
            cnt = -1;
        }else{
            // 큰 수(5)로 안나눠지면 작은 수(2)로 빼기
            while (n > 0) {
                if(n % 5 != 0){
                    n -= 2;
                    if(n<0){
                        cnt = -1;
                        break;
                    }
                    cnt++;
                }else{
                    cnt += n / 5;
                    n = n % 5;
                }
            }
        }
        System.out.print(cnt);
    }
}