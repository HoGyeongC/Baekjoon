import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int R;
        String S;

        for(int i=0;i<N;i++){
            R = scanner.nextInt();
            S = scanner.next();
            int len = S.length();
            for(int j=0;j<len;j++){
                for(int k=0;k<R;k++)
                    System.out.print(S.charAt(j));
            }
            System.out.println();
        }


    }
}