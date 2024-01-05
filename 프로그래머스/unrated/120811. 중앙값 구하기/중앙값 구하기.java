class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int l = array.length;
        int tmp;
        
        for(int i=0;i<l-1;i++){
            for(int j=i+1;j<l;j++){
                if(array[i]>array[j]){
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        
        return array[l/2];
    }
}