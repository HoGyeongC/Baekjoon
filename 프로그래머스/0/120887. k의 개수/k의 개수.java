class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int x=i;x<=j;x++){
            int y = x;
            while(y>0){
                if(y%10 == k){
                    answer++;
                }
                y /= 10;
            }
        }
        
        
        return answer;
    }
}