import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split(" ");
        int size = strArr.length;
        int[] numArr = new int[size];
        int i=0;
        
        for(String str:strArr){
            numArr[i++] = Integer.parseInt(str);
        }
        Arrays.sort(numArr);
        answer = numArr[0] + " " +numArr[i-1];
        return answer;
    }
}