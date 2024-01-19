import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = my_string.toLowerCase();
        char[] str = answer.toCharArray();
        Arrays.sort(str);
        
        String result = new String(str);
        
        return result;
    }
}