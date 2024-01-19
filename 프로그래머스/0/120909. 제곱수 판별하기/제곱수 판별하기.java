class Solution {
    public int solution(int n) {
        int answer = 1;
        
        while(answer * answer <= n){
            if(answer * answer == n)
                return 1;
            answer += 1;
        }
        
        return 2;
    }
}