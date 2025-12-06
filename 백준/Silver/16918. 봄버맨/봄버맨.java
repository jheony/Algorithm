import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static StringBuilder sb = new StringBuilder();
    static boolean[][] exist;
    static int[][] boomTime;
    static int r, c, n;
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        // 폭탄 존재 및 시간
        exist = new boolean[r][c];
        boomTime = new int[r][c];

        // 입력 폭탄 위치 설정
        for(int i=0; i<r; i++){
            String str = br.readLine();
            for(int j=0; j<c; j++){
                if(str.charAt(j) == 'O'){
                    exist[i][j] = true;
                    boomTime[i][j] = 2; // 3초 설정 후 1초 가만히
                }
            }
        }
        if(n==1){
            toAnswer();
            return;
        }

        // 모든 곳에 폭탄 설치
        allBooms();
        
        if(n % 2 == 0){
            toAnswer();
            return;            
        }
        
        int[] Xarr = {1, 0, -1, 0};
        int[] Yarr = {0, -1, 0, 1};
        
        // 폭탄 터짐
        for(int i=0; i<r; i++){ 
            for(int j=0; j<c; j++){
                if(--boomTime[i][j] == 0) {
                    exist[i][j] = false; // 파괴
                    for(int k=0; k<4; k++){
                        int nextX = i + Xarr[k];
                        int nextY = j + Yarr[k];
                        if(0<=nextX && nextX<r && 0<=nextY && nextY<c){
                            exist[nextX][nextY] = false; // 파괴
                        }
                    }                      
                }
            }
        }
        if(n % 4 == 3){
            toAnswer();
            return;            
        }
        
        // 모든 곳에 폭탄 설치
        allBooms();
        
        // 폭탄 터짐
        for(int i=0; i<r; i++){ 
            for(int j=0; j<c; j++){
                if(--boomTime[i][j] == 0) {
                    exist[i][j] = false; // 파괴
                    for(int k=0; k<4; k++){
                        int nextX = i + Xarr[k];
                        int nextY = j + Yarr[k];
                        if(0<=nextX && nextX<r && 0<=nextY && nextY<c){
                            exist[nextX][nextY] = false; // 파괴
                        }
                    }                      
                }
            }
        }
        if(n % 4 == 1){
            toAnswer();
            return;            
        }
    }
    
    public static void toAnswer(){
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                sb.append((exist[i][j]) ? "O" : ".");
            }
            sb.append("\n");
        }   
        System.out.println(sb);
    }
    
    public static void allBooms(){
        for(int i=0; i<r; i++){ 
            for(int j=0; j<c; j++){
                if(exist[i][j]){
                    boomTime[i][j]--;
                }else{
                    exist[i][j] = true;
                    boomTime[i][j] = 3;
                }
            }
        }
    }
}