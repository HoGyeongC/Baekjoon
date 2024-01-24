class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], sides[1]), min = Math.min(sides[0], sides[1]);
        
        
        //max가 가장 클 때 max < i + min, i < max
        int i = max;
        while(max < i + min){
            answer++;
            i--;
        }
        
        //i가 가장 클 때 i > max, i < min + max
        i = max + 1;
        while(i < min + max){
            answer++;
            i++;
        }
        
        
        return answer;
    }
}