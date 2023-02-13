import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for(int i=1;i<=N;i++){
            for(int j = N-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=i;k>0;k--){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}