class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        StringBuffer bef = new StringBuffer(before);
        
        for(int i=0;i<after.length();i++){
            int flag = 0;
            for(int j=0;j<bef.length();j++){
                if(after.charAt(i) == bef.charAt(j)){
                    bef.delete(j, j+1);
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                return 0;
            }
        }
        
        
        
        return 1;
    }
}