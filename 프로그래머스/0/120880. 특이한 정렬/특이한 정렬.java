class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        
        answer[0] = numlist[0];
        
        for(int i=1;i<numlist.length;i++){
            int flag = 0;
            for(int j=0;j<i;j++){
                if(flag == 1) break;
                int numLen = Math.max(numlist[i], n) - Math.min(numlist[i], n);
                int ansLen = Math.max(answer[j], n) - Math.min(answer[j], n);
                
                if(ansLen > numLen){
                    for(int k=i;k>j;k--){
                        answer[k] = answer[k-1];
                    }
                    answer[j] = numlist[i];
                    flag = 1;
                }
                if(ansLen == numLen && answer[j] <= numlist[i]){
                    for(int k=i;k>j;k--){
                        answer[k] = answer[k-1];
                    }
                    answer[j] = numlist[i];
                    flag = 1;
                }
            }
            if(flag == 0){
                answer[i] = numlist[i];
            }
        }
        
        return answer;
    }
}