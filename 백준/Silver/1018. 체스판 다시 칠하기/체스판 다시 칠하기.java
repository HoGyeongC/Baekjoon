import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String tmp = scanner.nextLine();
        String[] ttmp = tmp.split(" ");
        int M = Integer.parseInt(ttmp[1]);

        char[][] chese = new char[N][M];

        for(int i=0;i<N;i++){
            tmp = scanner.nextLine();
            for(int j=0;j<M;j++){
                chese[i][j] = tmp.charAt(j);
            }
        }
        int min = -1, cnt;
        for(int i=0;i+8<=N;i++){
            for(int j=0;j+8<=M;j++){
                cnt=0;
                for(int k=0;k<8;k++){
                    for(int l=0;l<8;l++){
                        if((k+l)%2==0){
                            if(chese[k+i][l+j] != 'W') {
                                cnt++;
                            }
                        }
                        else{
                            if(chese[k+i][l+j] != 'B') {
                                cnt++;
                            }
                        }
                    }
                }
                if(min==-1)
                    min = cnt;
                else if(min>cnt)
                    min = cnt;
            }
        }

        for(int i=0;i+8<=N;i++){
            for(int j=0;j+8<=M;j++){
                cnt=0;
                for(int k=0;k<8;k++){
                    for(int l=0;l<8;l++){
                        if((k+l)%2==0){
                            if(chese[k+i][l+j] != 'B')
                                cnt++;
                        }
                        else{
                            if(chese[k+i][l+j] != 'W')
                                cnt++;
                        }
                    }
                }
                if(min==-1)
                    min = cnt;
                else if(min>cnt)
                    min = cnt;
            }
        }
        
        System.out.println(min);

    }
}