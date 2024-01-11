class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] str = s.split(" ");
        
        int backup = 0;
        boolean plus = true;
        for(int i=0;i<str.length;i++){
            plus = true;
            if(str[i].equals("Z")){
                answer -= backup;
            }
            else{
                if(str[i].charAt(0) == '-'){
                    plus = false;
                }
                int num = 0;
                if(plus){
                    for(int j=0;j<str[i].length();j++){
                        num *= 10;
                        num += (int)(str[i].charAt(j) - '0');
                    }
                }
                else{
                    for(int j=1;j<str[i].length();j++){
                        num *= 10;
                        num += (int)(str[i].charAt(j) - '0');
                    }
                    num *= -1;
                }
                answer += num;
                backup = num;
            }
        }
        
        return answer;
    }
}