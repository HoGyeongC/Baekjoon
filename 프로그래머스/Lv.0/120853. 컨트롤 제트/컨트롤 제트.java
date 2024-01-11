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
                int num = Integer.parseInt(str[i]);
                answer += num;
                backup = num;
            }
        }
        
        return answer;
    }
}