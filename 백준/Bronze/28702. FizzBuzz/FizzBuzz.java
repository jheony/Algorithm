import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[4];
        int n=0;
        for(int i=3; i>0; i--){
            str[i] = sc.next();
            try{
                if(str[i].charAt(2) == 'z'){
                }
                else{
                    n = Integer.parseInt(str[i])+i;
                }
            }
            catch(Exception e){
                    n = Integer.parseInt(str[i])+i;
            }
        }
        if(n%15==0){
            System.out.print("FizzBuzz");
        }
        else if(n%3==0){
            System.out.print("Fizz");
        }
        else if(n%5==0){
            System.out.print("Buzz");
        }
        else
            System.out.print(n);
            
    }
}