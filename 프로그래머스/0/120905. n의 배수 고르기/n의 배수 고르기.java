import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> answer = new ArrayList<Integer>();
        
        for(int num : numlist){
            if(num % n == 0){
                answer.add(num);
            }
        }
        
        int[] result = answer.stream()
            .mapToInt(Integer::intValue)
                .toArray();
        
        return result;
    }
}