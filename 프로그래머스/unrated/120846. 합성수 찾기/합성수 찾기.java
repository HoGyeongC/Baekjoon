class Solution {
    public boolean countNum(int n){
        int cnt = 0;
        
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                cnt += 1;
            }
            if(cnt > 2) return true;
        }
        
        return false;
    }
    public int solution(int n) {
        int answer = 0;
        
        for(int i=n;i>0;i--){
            if(countNum(i)){
                answer += 1;
            }
        }
        
        return answer;
    }
}