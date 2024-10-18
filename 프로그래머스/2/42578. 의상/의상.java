import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> hm = new HashMap<>();
        
        for(String[] c : clothes){
            if(!hm.containsKey(c[1])){
                hm.put(c[1], 1);
            }
            else{
                hm.put(c[1], hm.get(c[1]) + 1);
            }
        }
        
        for(String s : hm.keySet()){
            answer *= (hm.get(s)+1);
        }
        
        
        return answer - 1;
    }
}