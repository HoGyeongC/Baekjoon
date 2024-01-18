class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.split(" ");
        
        answer = Integer.parseInt(str[0]);
        boolean plus = true;
        for(int i=1;i<str.length;i++){
            if(i%2 == 0){
                if(plus){
                    answer += Integer.parseInt(str[i]);
                }
                else{
                    answer -= Integer.parseInt(str[i]);
                }
            }
            else{
                if(str[i].equals("+")){
                    plus = true;
                }
                else{
                    plus = false;
                }
            }
        }
        
        return answer;
    }
}