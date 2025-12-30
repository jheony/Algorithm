import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int fromInt = sc.nextInt();
        int toInt = sc.nextInt();
        
        int cnt = 1;
        
        while (fromInt < toInt) {
            if(toInt % 2 == 0){
                toInt /= 2;
                cnt++;
            }else if(toInt % 10 == 1){
                toInt /= 10;
                cnt++;
            }else{
                break;
            }
        }

        cnt = (fromInt == toInt) ? cnt : -1;
        
        System.out.println(cnt);
    }
}