import java.util.*;

class Solution {
    public String solution(String bin1, String bin2) {
        char[] answer = new char[11];
        char[] bin11 = bin1.toCharArray();
        char[] bin22 = bin2.toCharArray();
        int binLen1 = bin11.length, binLen2 = bin22.length;
        
        for(int i=0;i<11;i++){
            answer[i] = '0';
        }
        
        for(int i=10;i>0;i--){
            if(10-i < binLen1){
                if(bin11[binLen1 - (10-i) - 1] == '1'){
                    if(answer[i] == '0'){
                        answer[i] = '1';
                    }
                    else{
                        answer[i-1] = '1';
                        answer[i] = '0';
                    }
                }
            }
            if(10-i < binLen2){
                if(bin22[binLen2 - (10-i) - 1] == '1'){
                    if(answer[i] == '0'){
                        answer[i] = '1';
                    }
                    else{
                        answer[i-1] = '1';
                        answer[i] = '0';
                    }
                }
            }
        }
        
        
        Long result = Long.parseLong(String.valueOf(answer));
        
        return String.valueOf(result);
    }
}