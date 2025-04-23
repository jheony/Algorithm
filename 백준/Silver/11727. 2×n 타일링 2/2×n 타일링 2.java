import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Long a=1L, b=3L, c=0L;
        
        if(n==1)
            c = a;
        else if(n==2)
            c = b;
        else{
            for(int i=2; i<n; i++){
                c = (b + 2*a)%10007;
                a = b;
                b = c;
            }
        }
        System.out.print(c);
    }
}