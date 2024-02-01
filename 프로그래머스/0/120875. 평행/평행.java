class Solution {
    public float slope(int[] d1, int[] d2){
        float result = (float)(d1[1] - d2[1]) / (d1[0] - d2[0]);

        if(result >= 0)
            return result;
        else
            return result * -1;
    }
    
    public int solution(int[][] dots) {
        int answer = 0;
        
        if(slope(dots[0], dots[1]) == slope(dots[2], dots[3]))
            return 1;
        if(slope(dots[0], dots[2]) == slope(dots[1], dots[3]))
            return 1;
        if(slope(dots[0], dots[3]) == slope(dots[1], dots[2]))
            return 1;

        return 0;
    }
}