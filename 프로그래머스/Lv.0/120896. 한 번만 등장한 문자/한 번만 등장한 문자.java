import java.util.*;

class Solution {
    public String solution(String s) {
        String[] answer = s.split("");
        
        for(int i=0;i<answer.length;i++){
            int cnt = 0;
            for(int j=0;j<answer.length;j++){
                if(answer[i].equals(answer[j])){
                    cnt++;
                }
                if(cnt > 1) break;
            }
            if(cnt != 1){
                s = s.replace(answer[i], "");
            }
        }
        
        String[] result = s.split("");
        Arrays.sort(result);
        
        return String.join("",result);
    }
}