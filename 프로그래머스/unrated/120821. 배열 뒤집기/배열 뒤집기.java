class Solution {
    public int[] solution(int[] num_list) {
        int tmp, len = num_list.length;
        
        for(int i=0;i<len/2;i++){
            tmp = num_list[i];
            num_list[i] = num_list[len-1-i];
            num_list[len-1-i] = tmp;
        }
        
        return num_list;
    }
}