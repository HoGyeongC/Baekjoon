class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer;
        if(my_str.length() % n == 0)
            answer = new String[my_str.length()/n];
        else
            answer = new String[my_str.length()/n + 1];
        
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<my_str.length();i++){
            if(i%n == 0 && i != 0){
                answer[i/n-1] = sb.toString();
                sb.delete(0,n);
            }
            sb.append(my_str.charAt(i));
        }
        
        if(my_str.length() % n != 0)
            answer[my_str.length()/n] = sb.toString();
        else
            answer[my_str.length()/n-1] = sb.toString();
        
        return answer;
    }
}