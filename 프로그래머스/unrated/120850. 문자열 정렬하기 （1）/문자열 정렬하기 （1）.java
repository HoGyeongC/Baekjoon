import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        StringBuffer my_string_buf = new StringBuffer(my_string);
        List<Integer> answer = new ArrayList<Integer>();
        
        for(int i=0;i<my_string_buf.length();i++){
            char ch = my_string_buf.charAt(i);
            if(ch >= '0' && ch <= '9'){
                answer.add((int)(ch-'0'));
            }
        }
        
        int[] arr = answer.stream()
            .mapToInt(Integer::intValue)
                .toArray();
        Arrays.sort(arr);
        
        return arr;
    }
}