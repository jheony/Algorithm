import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long r = sc.nextLong() - sc.nextLong();
        if(r<0)
            r *= -1;
        System.out.println(r);
        sc.close();
    }
}