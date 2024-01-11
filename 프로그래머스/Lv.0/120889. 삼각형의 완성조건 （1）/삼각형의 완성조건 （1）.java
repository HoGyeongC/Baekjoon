class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        if(sides[0] >= sides[1] && sides[0] >= sides[2]){
            if(sides[0] < sides[1] + sides[2])
                return 1;
            else
                return 2;
        }
        else if(sides[1] >= sides[2]){
            if(sides[1] < sides[0] + sides[2])
                return 1;
            else
                return 2;
        }
        else{
            if(sides[2] < sides[0] + sides[1])
                return 1;
            else
                return 2;
        }
    }
}