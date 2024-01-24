class Solution {
    public int solution(String[] spell, String[] dic) {
        
        for(int i=0;i<dic.length;i++){
            if(dic[i].length() == spell.length){
                int flag = 0;
                for(String s : spell){
                    if(!dic[i].contains(s)){
                        flag = 1;
                    }
                }
                if(flag == 0)
                    return 1;
            }
        }
        
        
        return 2;
    }
}