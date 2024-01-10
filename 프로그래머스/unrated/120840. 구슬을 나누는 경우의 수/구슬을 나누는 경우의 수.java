class Solution {
    public int solution(int balls, int share) {
        long answer = 1;
        
        for(int i=share+1;i<=balls;i++){
            answer = answer * i / (i-share);
        }
        
        return (int)answer;
    }
}