import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> hmap = new HashMap<>();
        
        for(String p : participant){
            if(hmap.get(p) == null){
                hmap.put(p, 1);
            }
            else{
                hmap.put(p, hmap.get(p) + 1);
            }
        }
        
        for(String c : completion){
            hmap.put(c, hmap.get(c) - 1);
        }
        
        for(String ks : hmap.keySet()){
            if(hmap.get(ks) > 0){
                answer = ks;
                break;
            }
        }
        
        
        return answer;
    }
}