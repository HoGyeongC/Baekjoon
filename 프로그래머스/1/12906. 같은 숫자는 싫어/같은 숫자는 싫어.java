import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> st = new Stack<>();
        
        st.push(arr[0]);
        for(int i : arr){
            if(st.peek() != i){
                st.push(i);
            }
        }
        
        int[] answer = st.stream().mapToInt(i -> i).toArray();
        
        
        return answer;
    }
}