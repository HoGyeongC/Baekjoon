class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int x1 = dots[0][0],x2 = 0,y1 = dots[0][1],y2 = 0;
        
        for(int i=1;i<4;i++){
            if(dots[i][0] != x1 && dots[i][0] != x2)
                x2 = dots[i][0];
            if(dots[i][1] != y1 && dots[i][1] != y2){
                y2 = dots[i][1];
            }
        }
        
        answer = (x1-x2) * (y1-y2);
        if(answer < 0)
            answer *= -1;
        
        return answer;
    }
}