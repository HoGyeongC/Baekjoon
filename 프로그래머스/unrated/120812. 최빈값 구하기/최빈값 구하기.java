class Solution {
    public int solution(int[] array) {
        int answer = 0,max = 0, len = array.length;
        int[] count = new int[len];
        
        for(int i=0;i<len;i++){
            count[i] = 0;
            for(int j=0;j<len;j++){
                if(array[i] == array[j]){
                    count[i] += 1;
                }
            }
            if(max < count[i]){
                max = count[i];
                answer = array[i];
            }
            else if(max == count[i] && answer != array[i]){
                answer = -1;
            }
        }
        return answer;
    }
}