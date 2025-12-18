import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
    public static class Point{
        int x, y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static char[][] keyboard = {
            {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'},
            {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'},
            {'z', 'x', 'c', 'v', 'b', 'n', 'm'}
        };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String left = sc.next();
        Point leftPt = getPoint(left.charAt(0));
        
        String right = sc.next();
        Point rightPt = getPoint(right.charAt(0));
        
        String lefts = "qwertasdfgzxcv";
        String rights = "yuiophjklbnm";
        
        String inputStr = sc.next();
        int time = 0;
        
        for(int i=0; i<inputStr.length(); i++){
            
            char x = inputStr.charAt(i);
            Point next = getPoint(x);
            
            if(lefts.contains(x+"")){
                time += Math.abs(leftPt.x - next.x) + Math.abs(leftPt.y - next.y);
                leftPt = next;
            }
            if(rights.contains(x+"")){
                time += Math.abs(rightPt.x - next.x) + Math.abs(rightPt.y - next.y);
                rightPt = next;
            }
            time++;
        }
        System.out.print(time);
    }
    
    public static Point getPoint(char findChar){
        for(int i=0; i<3; i++){
            for(int j=0; j<keyboard[i].length; j++){
                if(findChar == keyboard[i][j]){
                    return new Point(i, j);
                }
            }
        }
        return new Point(-1,-1);
    }
}