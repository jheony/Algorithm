import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), empty;
        int r = a+b+c;
        if(b<c && a<c){
            empty = a;
            a = c;
            c = empty;
        }
        else if(c<b && a<b){
            empty = a;
            a = b;
            b = empty;
        }
        if(a == b && b == c && c == a)
            r = 3*a;
        else if(b+c <= a){
            r = 2*(b+c)-1;
        }
        System.out.print(r);
    }
}