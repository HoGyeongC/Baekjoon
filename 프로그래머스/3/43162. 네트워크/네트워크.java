class Solution {
    public boolean[] dfs(int[][] computers, boolean[] network, int i){

        for(int j=0;j<computers.length;j++){
            if(computers[i][j] == 1 && network[j] == false){
                network[j] = true;
                network = dfs(computers, network, j);
            }
        }
        
        return network;
    }
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] network = new boolean[n];
        
        for(int i=0;i<computers.length;i++){
            if(network[i] == false){
                answer++;
                network = dfs(computers, network, i);
            }
        }
        
        
        
        return answer;
    }
}