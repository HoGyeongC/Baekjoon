import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer=nums.length / 2;
        Map<Integer, Integer> hm = new HashMap<>();
        
        for(int n : nums){
            if(hm.containsKey(n)){
                hm.put(n, hm.get(n)+1);
            }
            else{
                hm.put(n, 1);
            }
        }
        
        if(hm.size() < answer){
            return hm.size();
        }
        
        
        return answer;
    }
}