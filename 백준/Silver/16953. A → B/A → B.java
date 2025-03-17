import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long a = sc.nextLong(), b = sc.nextLong(), cnt=1L;
        while (b>a) {
            if(b%2 == 0){
                b = b / 2; 
            }
            else if(b%10 == 1){
                b = b / 10;
            }
            else
                break;
            cnt++;        
        }
        if(!b.equals(a))
            cnt = -1L;
        System.out.println(cnt);
        sc.close();
    }
}