class Solution {
    public String solution(String my_string) {
        StringBuffer str = new StringBuffer(my_string);
        StringBuffer answer = new StringBuffer();
        
        for(int i=0;i<my_string.length();i++){
            char ch = str.charAt(i);
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
                answer.append(ch);
            }
        }
        
        
        return answer.toString();
    }
}