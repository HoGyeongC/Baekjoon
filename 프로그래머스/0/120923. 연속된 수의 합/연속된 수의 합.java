import java.util.*;

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        if(num % 2 != 0){
            answer[num/2] = total/num;
            for(int i=0;i<num/2;i++){
                answer[num/2 + 1 + i] = answer[num/2 + i] + 1;
                answer[num/2 - 1 - i] = answer[num/2 - i] - 1;
            }
        }
        else if(num % 2 == 0){
            answer[num/2 - 1] = total/num;
            for(int i=0;i<num/2 - 1;i++){
                answer[num/2 + i] = answer[num/2 + i - 1] + 1;
                answer[num/2 - 2 - i] = answer[num/2 - 1 - i ] - 1;
            }
            answer[num-1] = answer[num-2] + 1;
        }
        
        
        return answer;
    }
}