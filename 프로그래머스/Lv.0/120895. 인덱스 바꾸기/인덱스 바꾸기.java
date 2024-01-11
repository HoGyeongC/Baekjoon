class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuffer answer = new StringBuffer(my_string);
        
        char ch1 = answer.charAt(num1), ch2 = answer.charAt(num2);
        answer.delete(num1, num1+1);
        answer.insert(num1, ch2);
        answer.delete(num2, num2+1);
        answer.insert(num2, ch1);
        
        return answer.toString();
    }
}