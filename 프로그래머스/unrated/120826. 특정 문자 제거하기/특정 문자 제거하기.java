class Solution {
    public String solution(String my_string, String letter) {
        StringBuffer sb = new StringBuffer(my_string);
        StringBuffer answer = new StringBuffer();
        
        for(int i=0;i<sb.length();i++){
            if(!String.valueOf(sb.charAt(i)).equals(letter)){
                answer.append(sb.charAt(i));
            }
        }
        
        return answer.toString();
    }
}