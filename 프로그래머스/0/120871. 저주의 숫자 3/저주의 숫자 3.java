class Solution {
    public boolean inThree(int n){
        
        while(n>0){
            if(n%10==3) return true;
            n /= 10;
        }
        
        return false;
    }
    
    public int solution(int n) {
        int answer = 1, flag;
        
        for(int i=1;i<=n;i++){
            flag = 0;
            while(inThree(answer) == true || answer % 3 == 0){
                answer++;
                flag = 1;
            }
            answer++;
        }
        
        return answer-1;
    }
}