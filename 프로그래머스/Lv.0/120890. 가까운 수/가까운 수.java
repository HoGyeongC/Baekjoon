import java.lang.Math;

class Solution {
    public int solution(int[] array, int n) {
        int d = Integer.MAX_VALUE, answer = 0;
        
        for(int i=0;i<array.length;i++){
            int dev = Math.max(n-array[i], array[i]-n);
            if(d > dev){
                d = dev;
                answer = array[i];
            }
            else if(d == dev){
                answer = Math.min(answer, array[i]);
            }
        }
        
        return answer;
    }
}