class Solution {
    public String solution(String rsp) {
        StringBuffer answer = new StringBuffer();
        String [] arrrsp = rsp.split("");
        
        for(int i=0;i<arrrsp.length;i++){
            if(arrrsp[i].equals("2")){
                answer.append("0");
            }
            else if(arrrsp[i].equals("0")){
                answer.append("5");
            }
            else if(arrrsp[i].equals("5")){
                answer.append("2");
            }
        }
        
        return answer.toString();
    }
}