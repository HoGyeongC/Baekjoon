class Solution {
    public int solution(int n) {
        int answer = n;
        
        while(true){
            if(answer%n == 0 && answer%6 == 0)
                break;
            answer+=1;
        }
        
        return answer/6;
    }
}