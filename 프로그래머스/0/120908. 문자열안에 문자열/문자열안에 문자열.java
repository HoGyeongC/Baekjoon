class Solution {
    public int solution(String str1, String str2) {
        String[] sa1 = str1.split("");
        String[] sa2 = str2.split("");
        int lenSa1 = sa1.length, lenSa2 = sa2.length;
        
        
        for(int i=0;i<lenSa1 - lenSa2 + 1;i++){
            if(sa1[i].equals(sa2[0])){
                int cnt = 0;
                for(int j=0;j<lenSa2;j++){
                    if(sa1[i+j].equals(sa2[j])) cnt++;
                }
                if(cnt == lenSa2)
                    return 1;
            }
        }
        
        return 2;
    }
}