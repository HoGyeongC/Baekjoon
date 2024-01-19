class Solution {
    public String[] solution(String[] quiz) {
        StringBuffer answer = new StringBuffer();
        
        for(int i=0;i<quiz.length;i++){
            String[] quizOX = quiz[i].split(" ");
            if(quizOX[1].equals("+")){
                if(Integer.parseInt(quizOX[0]) + Integer.parseInt(quizOX[2]) == Integer.parseInt(quizOX[4])){
                    answer.append("O");
                }
                else{
                    answer.append("X");
                }
            }
            else{
                if(Integer.parseInt(quizOX[0]) - Integer.parseInt(quizOX[2]) == Integer.parseInt(quizOX[4])){
                    answer.append("O");
                }
                else{
                    answer.append("X");
                }
            }
        }
        
        
        return answer.toString().split("");
    }
}