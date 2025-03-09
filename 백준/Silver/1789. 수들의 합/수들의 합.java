import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n= sc.nextLong(), s=0L, max=0L;
        if(n == 1L || n == 2L)
            max = 1L;
        for(Long i=1L;i<n;i++){
            s += i;
            
            if(s==n){
                max=i;
                break;
            }
            else if(s>n){
                max=i-1;
                break;
            }
        }
        System.out.print(max);
    }
}