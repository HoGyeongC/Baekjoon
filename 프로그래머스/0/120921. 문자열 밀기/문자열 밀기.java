class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        StringBuffer AA = new StringBuffer(A);
        
        if(AA.toString().equals(B))
            return answer;
        for(int i=0;i<A.length()-1;i++){
            char last = AA.charAt(AA.length()-1);
            AA.delete(AA.length()-1, AA.length());
            AA.insert(0,last);
            answer++;
            if(AA.toString().equals(B)){
                return answer;
            }
        }
        
        
        return -1;
    }
}