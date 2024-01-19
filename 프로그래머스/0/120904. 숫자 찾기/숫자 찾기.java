class Solution {
    public int solution(int num, int k) {
        int answer = 0, size = 1;
        
        while(num > 0){
            if(num%10 == k){
                answer = size;
            }
            num /= 10;
            size += 1;
        }
        
        if(answer == 0)
            return -1;
        else
            return size - answer;
    }
}