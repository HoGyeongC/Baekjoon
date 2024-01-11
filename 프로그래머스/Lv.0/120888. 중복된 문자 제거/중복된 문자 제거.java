class Solution {
    public String solution(String my_string) {
        StringBuffer answer = new StringBuffer();
        
        for(int i=0;i<my_string.length();i++){
            int flag = 0;
            for(int j=0;j<i;j++){
                if(my_string.charAt(i) == my_string.charAt(j)){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                answer.append(my_string.charAt(i));
            }
        }
        
        
        return answer.toString();
    }
}