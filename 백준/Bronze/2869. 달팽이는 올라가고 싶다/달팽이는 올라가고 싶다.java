import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong(), v = sc.nextLong(), cnt;
        long g = a - b;
        long newV = v - a;
        cnt = newV/g + 1;
        if (newV % g != 0)
            cnt++;
        System.out.println(cnt);
    }
}