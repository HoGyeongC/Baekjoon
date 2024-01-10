import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean isSoin(int n){
        int cnt = 0;
        
        for(int i=1;i<=n;i++){
            if(n%i == 0)
                cnt++;
        }
        if(cnt == 2) return true;
        else return false;
    }
    
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<Integer>();
        
        for(int i=2;i<=n;i++){
            if(isSoin(i) && n%i == 0){
                answer.add(i);
            }
        }
        
        int[] result = answer.stream()
            .mapToInt(Integer::intValue)
                .toArray();
        
        return result;
    }
}