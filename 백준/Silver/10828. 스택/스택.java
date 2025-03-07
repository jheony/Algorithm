import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int n = sc.nextInt(), cnt, size;
        String s;
        
        for(int i=0; i<n; i++){
            s = sc.next();
            size = arr.size();
            switch (s) {
                case "push":
                    cnt = sc.nextInt();
                    arr.add(cnt);
                    break;
                case "pop":
                    if(size != 0){
                        sb.append(arr.remove(size-1)+"\n");
                    }else
                        sb.append("-1\n");
                    break;
                case "size":
                    sb.append(size+"\n");
                    break;
                case "empty":
                    if(size == 0)
                        sb.append(1+"\n");
                    else
                        sb.append(0+"\n");
                    break;
                case "top":
                    if(size != 0){
                        sb.append(arr.get(size-1)+"\n");
                    }else
                        sb.append("-1"+"\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}