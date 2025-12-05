class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int one = 0, two = 0;
        boolean isPossible = false;
        for(int s=0; s<goal.length; s++){
            isPossible = false;
            if(one < cards1.length && goal[s].equals(cards1[one])){
                one++;
                isPossible = true;
                
            }else if(two < cards2.length &&goal[s].equals(cards2[two])){
                two++;
                isPossible = true;
            }
//             for(int i=one+1; i<cards1.length; i++){
//                 if(goal[s].equals(cards1[i])){
//                     one = i;
//                     isPossible = true;
//                     break;
//                 }
//             }

//             for(int j=two+1; j<cards2.length; j++){
//                 if(goal[s].equals(cards2[j])){
//                     two = j;
//                     isPossible = true;
//                     break;
//                 }
//             }
            if(!isPossible){
                break;
            }
        }
        answer = (isPossible) ? "Yes" : "No";
        return answer;
    }
}