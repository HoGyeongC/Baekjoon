import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        String OX;
        for(int i=0;i<N;i++){
            OX = scanner.nextLine();
            int len = OX.length();
            int cnt=0, sum=0;
            for(int j=0;j<len;j++){
                if(OX.charAt(j)=='O'){
                    cnt+=1;
                    sum+=cnt;
                }
                else{
                    cnt=0;
                }
            }
            System.out.println(sum);
        }


    }
}