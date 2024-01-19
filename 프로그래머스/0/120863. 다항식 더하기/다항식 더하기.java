class Solution {
    public String solution(String polynomial) {
        StringBuffer answer = new StringBuffer();
        String[] poly = polynomial.split(" ");
        int[] num = {0,0};
        
        
        for(int i=0;i<poly.length;i++){
            if(!poly[i].equals("+")){
                if(poly[i].equals("x")){
                    num[0]++;
                }
                else if(poly[i].contains("x")){
                    num[0] += Integer.parseInt(poly[i].replace("x",""));
                }
                else{
                    num[1] += Integer.parseInt(poly[i]);
                }
            }
        }
        
      
        if(num[0] != 0){
            if(num[0] == 1)
                answer.append("x");
            else
                answer.append(num[0] + "x");
        }
        if(num[0] != 0 && num[1] != 0){
            answer.append(" + ");
        }
        if(num[1] != 0){
            answer.append(num[1]+"");
        }
        
        return answer.toString();
    }
}