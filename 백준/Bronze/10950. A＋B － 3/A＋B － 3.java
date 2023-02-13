import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for(int i=0;i<N;i++){
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            System.out.println(n1+n2);

        }


    }
}