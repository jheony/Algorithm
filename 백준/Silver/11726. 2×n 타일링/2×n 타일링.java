import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Long a=1l, b=2l, c=0l;
        if(n == 1)
            System.out.println(1);
        else if(n == 2)
            System.out.println(2);
        else{
            for(int i=2; i<n; i++){
                c = (a + b) % 10007;
                a = b;
                b = c;
            }
            System.out.print(c);
        }
    }
}