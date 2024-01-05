import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int money) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        answer.add(money/5500);
        answer.add(money%5500);
        
        return answer;
    }
}