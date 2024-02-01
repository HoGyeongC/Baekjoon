class Solution {
    public boolean isPrime(int x){
        for(int i=2;i<x;i++){
            if(x%i == 0)
                return false;
        }
        return true;
    }
    
    public int solution(int a, int b) {
        int answer = 0;
        
        for(int i=2;i<=Math.min(a,b);i++){
            if(a%i == 0 && b%i == 0){
                a /= i;
                b /= i;
            }
        }
        
        if(b == 1)
            return 1;
        
        if(isPrime(b) && b != 2 && b != 5)
            return 2;
        
        for(int i=2;i<b;i++){
            if(i%2 != 0 && i%5 != 0){
                if(b%i == 0){
                    return 2;
                }
            }
        }
        
        
        return 1;
    }
}