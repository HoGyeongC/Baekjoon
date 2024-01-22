class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for(int i=0;i<my_string.length();i++){
            int num = 0;
            char ch = my_string.charAt(i);
            while(ch >= '0' && ch <= '9'){
                num *=10;
                num += Integer.parseInt(String.valueOf(ch));
                i++;
                if(i>=my_string.length())
                    break;
                ch = my_string.charAt(i);
            }
            answer += num;
        }
        
        return answer;
    }
}