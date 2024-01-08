class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        StringBuffer sb = new StringBuffer(my_string);
        
        for(int i=0;i<sb.length();i++){
            String tmp = String.valueOf(sb.charAt(i)).repeat(n);
            answer += tmp;
        }
        
        return answer;
    }
}