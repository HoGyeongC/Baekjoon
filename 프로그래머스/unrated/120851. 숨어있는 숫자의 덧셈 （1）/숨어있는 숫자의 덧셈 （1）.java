class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] arr = my_string.replaceAll("[A-Z|a-z]","").split("");
        
        for(int i=0;i<arr.length;i++){
            answer += (int)(arr[i].charAt(0) - '0');
        }
        
        return answer;
    }
}